package com.p1;

import java.util.Arrays;  
import java.util.List;
 
import com.p1.ToDoService;  

public class ToDoServiceStub implements ToDoService   {  

    public List<String> getTodos(String user) {  

    return Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use Hibernate ", " Use Spring MVC ");  
    }  
 }  
