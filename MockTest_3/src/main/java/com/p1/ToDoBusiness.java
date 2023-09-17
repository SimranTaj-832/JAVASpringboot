package com.p1;

import java.util.ArrayList;
import java.util.List;

//ToDoBusiness is a SUT(system under test)
//ToDoService is a Dependency(as ToDoBusiness is dependent on it)

public class ToDoBusiness {
	public ToDoService doService;
	public ToDoBusiness(ToDoService doService) {
		this.doService=doService;
	}
	public List<String>getTodosforHibernate(String user){
		List<String>hibernatelist=new ArrayList<String>();
		List<String>combinedlist=doService.getTodos(user);
		
		for(String todo:combinedlist) {
			if(todo.contains("Spring")) {
				hibernatelist.add(todo);
			}
		} return hibernatelist;
	}
	

}
