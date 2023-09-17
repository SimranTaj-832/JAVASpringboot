package com.p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmpMap {
	HashMap<Integer,Emp>emap;
	public EmpMap() {}
	public EmpMap(HashMap<Integer,Emp>emap) {
		this.emap=emap;
	}
	
	public HashMap<Integer,Emp>getEmpMap(){
		return emap;
	}
	public void setEmpMap(HashMap<Integer, Emp>emap) {
		this.emap=emap;
	}
	public void displayList() {
		Set<Map.Entry<Integer,Emp>>set=emap.entrySet();
		for(Map.Entry<Integer, Emp>me:set) {
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
			System.out.println();
		}
	}
}
