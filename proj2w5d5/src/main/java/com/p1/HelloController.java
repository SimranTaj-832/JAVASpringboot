package com.p1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	@RequestMapping("/")//tells container about display() req handler meth
	public String display() {
		return "index";//name of view
	}

}
