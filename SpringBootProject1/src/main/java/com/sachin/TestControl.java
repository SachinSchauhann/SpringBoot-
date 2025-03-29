package com.sachin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestControl {
@RequestMapping("/p1")
public void hi() {
	System.out.println("Hi....mathed call by spring boot");
}
@RequestMapping("/p2")
@ResponseBody
public String hello() {
	return "hello using spring boot";
}
@RequestMapping("/p3")
@ResponseBody
public String getName(HttpServletRequest request) {
	return "welcome " +request.getParameter("name");
	
}



}
