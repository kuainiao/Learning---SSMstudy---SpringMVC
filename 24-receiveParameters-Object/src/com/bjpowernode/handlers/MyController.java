package com.bjpowernode.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bjpowernode.beans.Student;

@Controller    
@RequestMapping("/test")    
public class MyController {

	@RequestMapping("/register.do")
	public ModelAndView doRegister(Student student) {
		System.out.println("name = " + student.getName());
		System.out.println("age = " + student.getAge());
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	

}


















