package com.bjpowernode.handlers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    
@RequestMapping("/test")    
public class MyController {

	@RequestMapping("/some.do")
	public String doSome(HttpSession session) {
		
		System.out.println("执行处理器的doSome()方法");
		
		return "/welcome.jsp";
	}

}


















