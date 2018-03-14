package com.bjpowernode.handlers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller    
@RequestMapping("/test")    
public class MyController {

	@RequestMapping("/register.do")
	public ModelAndView doRegister(int age, Date birthday) {
		System.out.println("age = " + age);
		System.out.println("birthday = " + birthday);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("birthday", birthday);
		mv.addObject("age", age);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	public ModelAndView exceptionResolver(HttpServletRequest request, Exception ex) {
		String age = request.getParameter("age");
		String birthday = request.getParameter("birthday");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("age", age);
		mv.addObject("birthday", birthday);
		mv.setViewName("/index.jsp");
		return mv;
	}
	

}


















