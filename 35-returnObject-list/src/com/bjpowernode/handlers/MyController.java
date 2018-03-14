package com.bjpowernode.handlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjpowernode.beans.Student;

@Controller    
@RequestMapping("/test")    
public class MyController {

	@RequestMapping("/myAjax.do")
	@ResponseBody   // 将返回的数据放入到响应体中
	public Object doAjax()  {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("张三", 23));
		list.add(new Student("李四", 24));
		
		return list;
	}

}


















