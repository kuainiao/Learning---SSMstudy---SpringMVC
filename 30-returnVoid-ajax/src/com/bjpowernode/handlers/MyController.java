package com.bjpowernode.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    
@RequestMapping("/test")    
public class MyController {

	@RequestMapping("/myAjax.do")
	public void doAjax(String name, int age, HttpServletResponse response) throws IOException {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pname", name);
		map.put("page", age);
		
		JSONObject myJson = JSONObject.fromObject(map);
		String jsonStr = myJson.toString();
		
		PrintWriter out = response.getWriter();
		out.print(jsonStr);
		out.close();
	}


}


















