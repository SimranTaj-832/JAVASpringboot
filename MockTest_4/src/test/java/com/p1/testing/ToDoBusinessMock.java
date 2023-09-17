package com.p1.testing;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import com.p1.ToDoBusiness;
import com.p1.ToDoService;

public class ToDoBusinessMock {
	@Test
	public void deleteTodosusung_BDD() {
		//Given
		ToDoService todoService=mock(ToDoService.class);
		List<String>combinedlist=Arrays.asList("Use Core Java","Use Spring Core","Use w3eHibernate","Use Spring MVC");
		given(todoService.getTodos("dummy")).willReturn(combinedlist);
		ToDoBusiness business=new ToDoBusiness(todoService);
		
		//When
		business.deleteTodosNotRelatedToHibernate("dummy");
		
		//Then
		
	}
}
