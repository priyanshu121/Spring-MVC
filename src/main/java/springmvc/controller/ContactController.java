package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, 
			@RequestParam("name") String name,
			@RequestParam("pass") String pass, Model model) {
		System.out.println("user name: "+name);
		System.out.println("user email: "+email);
		System.out.println("user password: "+pass);
		
		//Process
		
		
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("pass", pass);
		
		return "success";
		
	
}
}
