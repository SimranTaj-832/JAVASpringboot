package com.p1.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.p1.model.*;
import com.p1.repository.*;

@Service
public class BankingService {
	@Autowired
	BankingRepository bankingRepository;
	
	//get all banking
	public List<Banking>getAllTrns(){
		List<Banking>banking=new ArrayList<Banking>();
		bankingRepository.findAll().forEach(banks1->banking.add(banks1));
		return banking;
	}
	
	//getting specific record
	public Banking getBankingById(int acnum) {
		return bankingRepository.findById(acnum).get();
	}
	//save r update
	public void saveOrUpdate(Banking banking) {
		bankingRepository.save(banking);
	}
	//delete
	public void delete(int trnum) {
		bankingRepository.deleteById(trnum);
	}

}
