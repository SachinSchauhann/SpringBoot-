package com.sachin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/Home")
    public String openHome(Model m) {
    	User u=new User();
    	u.setName("Sachin");
    	u.setAge(23);
    	m.addAttribute("user", u);
    	return "Home";
    }
    @RequestMapping("/save")
	public String processHome(@ModelAttribute User user, Model m) {
    	
    	m.addAttribute("msg", "Welcome : "+user.getName()+  ",  Your Age : "+user.getAge());
		return "s";
	}
	
}

