package com.cntrlr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.p1.BankDao;
import com.pojo.Accounts;
import com.pojo.Banking;
import com.pojo.Customer;



@Controller
public class BankController {
	@Autowired
	BankDao dao;
	@RequestMapping("/regform")
	public String showform(Model m) {
		m.addAttribute("command",new Customer());
		return "regform";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String regsave(@ModelAttribute("emp")Customer c) {
		dao.reg(c);
		return "redirect:/loginform";
	}
	@RequestMapping(value="/loginform/{cid,pass}")
	public String login(@PathVariable int cid,String pass, Model m) {
		Customer c=dao.login(cid);
		try {
		if(c.getPass()==pass) {
		m.addAttribute("command",c);
		return "empEditform";
		}
		else {
			throw new BankException("Invalid login \n");}
		} catch (BankException ex) {
			System.out.println(ex.getMessage());
			return(ex.getMessage());}
	}
	@RequestMapping(value="/home/{cid}")
	public String viewacc(@PathVariable int cid, Model m) {
		List<Accounts> list=dao.getAccounts(cid);
		m.addAttribute("list",list);
		return "home";
	}
	@RequestMapping(value="/deposit/{acnum}")
	public String deposit(@PathVariable int acnum, Model m) {
		Banking b=new Banking();
		dao.deposit(b,acnum);
		m.addAttribute("command",b);
		return "deposit";
	}
	@RequestMapping(value="/withdraw/{acnum}")
	public String withdraw(@PathVariable int acnum, Model m) {
		Banking b=new Banking();
		dao.deposit(b,acnum);
		m.addAttribute("command",b);
		return "withdraw";
	}
	@RequestMapping(value="/transactions/{acnum}")
	public String trans(@PathVariable int acnum, Model m) {
		List<Banking> list1=dao.getTrns(acnum);
		m.addAttribute("list",list1);
		return "transactions";
	}
	
	@RequestMapping(value="/delete/{acnum}",method=RequestMethod.GET)
	public String delete(@PathVariable int acnum) {
		dao.delete(acnum);
		return "redirect:/home";
	}
	
}