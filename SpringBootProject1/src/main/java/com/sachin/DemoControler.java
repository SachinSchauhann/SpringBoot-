package com.sachin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
@Controller
public class DemoControler {

	@RequestMapping("/p5")
	public String openF1() {
		return "Form";
	}
	@RequestMapping("/p5control")
	@ResponseBody
	public String processF1 (@RequestParam("fn") String fn,@RequestParam("mn") String mn,@RequestParam("ln") String ln) {
		//(HttpServletRequest request)
//	String fn=request.getParameter("fn");
//	String mn=request.getParameter("mn");
//	String ln=request.getParameter("ln");
	String FullName = fn+" "+mn+" "+ln;
	return "Welcome : " +FullName;
	}
	@RequestMapping("/p6/{n1}/{n2}")
	//http://localhost:8080/p6/4
	@ResponseBody

//	public String fatchDataForm(@PathVariable("id") Integer x) {
//		return "Squre is : " +(x*x)+ "  "+"Cube is:" +(x*x*x);
		public String fatchDataForm(@PathVariable("n1") Integer n1 ,@PathVariable("n2") Integer n2 ) {
			return "Addition : " +(n1+n2)+ " _________  "+"Multiplication is:" +(n1*n2);
	}
}
