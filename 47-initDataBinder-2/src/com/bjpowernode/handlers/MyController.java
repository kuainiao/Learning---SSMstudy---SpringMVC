package com.bjpowernode.handlers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bjpowernode.editors.MyDateEditor;

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
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new MyDateEditor());
	}

}


















