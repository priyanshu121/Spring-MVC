package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import springmvc.model.User;

@Controller
public class ContactController {
	
	@Autowired
	private springmvc.service.UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn code with Priyanshu");
		m.addAttribute("Desc", "Home for programmer");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
//		m.addAttribute("Header", "Learn code with Priyanshu");
//		m.addAttribute("Desc", "Home for programmer");
		return "contact";
	}

	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		
		if(user.getName().isBlank()) {
			return "redirect:/contact";
		}
		
//		model.addAttribute("Header", "Learn code with Priyanshu");
//		model.addAttribute("Desc", "Home for programmer");
		
		//model.addAttribute("user", user);
		this.userService.createUser(user);
		int createdUser=this.userService.createUser(user);
		model.addAttribute("msg", "User created with id "+createdUser);
		return "success";
		
	
}
	
	
	
/*	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, 
			@RequestParam("name") String name,
			@RequestParam("pass") String pass, Model model) {
//		System.out.println("user name: "+name);
//		System.out.println("user email: "+email);
//		System.out.println("user password: "+pass);
		
		User  user=new User();
		user.setEmail(email);
		user.setName(name);
		user.setPass(pass);
		
		System.out.println(user);
		//Process
		
		
//		model.addAttribute("name", name);
//		model.addAttribute("email", email);
//		model.addAttribute("pass", pass);
		
		model.addAttribute("user", user);
		
		return "success";
		
	
}
*/
	
	
}
