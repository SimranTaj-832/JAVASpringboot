package com.p1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ExampleController {
	@GetMapping
	public String welcomeMessage() {
		String msg="Example2 Hello World !!!!! ";
		return msg;
	}
	

}
