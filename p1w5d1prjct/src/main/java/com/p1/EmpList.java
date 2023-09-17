package com.p1;

import java.util.Iterator;
import java.util.LinkedList;

public class EmpList {
	LinkedList<Emp> emplist; 
	public EmpList() {}
	
	public EmpList(LinkedList<Emp> emplist) {
		this.emplist=emplist;
	}
	public LinkedList<Emp> getEmplist(){
		return emplist;
	}
	public void setEmplist(LinkedList<Emp> emplist) {
		this.emplist=emplist;
	}
	public void displayList() {
		Iterator<Emp>it=emplist.iterator();
		while(it.hasNext()) {
			Emp eobj=(Emp)it.next();
			System.out.println(eobj.eid+" "+eobj.ename+" "+eobj.salary);
		}
	}
	  
}
