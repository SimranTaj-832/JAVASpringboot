package com.p1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.p1.model.*;
import com.p1.service.*;

@RestController
public class BankingController {
	@Autowired
	BankingService bankingService;
	
	//get mapping to retrive
		@GetMapping("/banking")
		private List<Banking>getAlltrns(){
			return bankingService.getAllTrns();
		}
		
		//specific account trns
		@GetMapping("/banking/{acnum}")
		private Banking getBanking(@PathVariable("acnum")int acnum){
			return bankingService.getBankingById(acnum);
		}
		
		
		@PostMapping("/bankingadd")
		private int saveTrns(@RequestBody Banking banking) {
			bankingService.saveOrUpdate(banking);
			return banking.getTrnum();
		}
		
		@PutMapping("/bankingupd")
		private Banking update(@RequestBody Banking banking) {
			bankingService.saveOrUpdate(banking);
			return banking;
		}
}
