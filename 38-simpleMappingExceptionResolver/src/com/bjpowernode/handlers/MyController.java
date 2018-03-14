package com.bjpowernode.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bjpowernode.exceptions.AgeException;
import com.bjpowernode.exceptions.NameException;
import com.bjpowernode.exceptions.StudentException;

@Controller    
@RequestMapping("/test")    
public class MyController {

	@RequestMapping("/register.do")
	public ModelAndView doRegister(String name, int age) throws StudentException {

		int i = 3 / 0;
		
		if(!"beijing".equals(name)) {
			throw new NameException("用户名不正确");
		}
		if(age > 60) {
			throw new AgeException("太老了");
		}
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("age", age);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	

}


















