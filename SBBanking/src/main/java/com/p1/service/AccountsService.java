package com.p1.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.p1.model.*;
import com.p1.repository.*;

@Service
public class AccountsService {
	@Autowired
	AccountsRepository accountsRepository;
	
	//get all accounts
	public List<Accounts>getAllaccounts(){
		List<Accounts>accounts=new ArrayList<Accounts>();
		accountsRepository.findAll().forEach(accounts1->accounts.add(accounts1));
		return accounts;
	}
	
	//getting specific record
	public Accounts getAccountsById(int cid) {
		return accountsRepository.findById(cid).get();
	}
	//save or update
	public void saveOrUpdate(Accounts accounts) {
		accountsRepository.save(accounts);
	}
	//delete
	public void delete(int acnum) {
		accountsRepository.deleteById(acnum);
	}


}
