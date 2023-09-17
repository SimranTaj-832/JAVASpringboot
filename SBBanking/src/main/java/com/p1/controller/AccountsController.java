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
public class AccountsController {
	@Autowired
	AccountsService accountsService;
	
	//get mapping to retrive
	@GetMapping("/accounts")
	private List<Accounts>getAllaccounts(){
		return accountsService.getAllaccounts();
	}
	
	//specific accounts
	@GetMapping("/accounts/{cid}")
	private Accounts getBooks(@PathVariable("cid")int cid){
		return accountsService.getAccountsById(cid);
	}
	
	//delete
	@DeleteMapping("/accountsdel/{acno}")
	private void deleteAccount(@PathVariable("acno")int acno) {
		accountsService.delete(acno);
	}
	
	@PostMapping("/accountsadd")
	private int saveAccounts(@RequestBody Accounts accounts) {
		accountsService.saveOrUpdate(accounts);
		return accounts.getAcnum();
	}
	
	@PutMapping("/accountsupd")
	private Accounts update(@RequestBody Accounts accounts) {
		accountsService.saveOrUpdate(accounts);
		return accounts;
	}
}
