package com.bjpowernode.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    // 表示当前类是一个处理器
@RequestMapping("/test")     // 命名空间
public class MyController {

	@RequestMapping("/some.do")
	public String doSome() {
		// 物理视图
		return "/WEB-INF/jsp/welcome.jsp";
	}

}


















