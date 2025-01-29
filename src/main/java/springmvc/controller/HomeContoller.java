package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContoller {
	
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", "priyanshu agarwal");
		
		System.out.println("This is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("This is about url");
		return "about";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is help url");
		// Creating Model and view object...
		ModelAndView modelAndView=new ModelAndView();
		// Setting the data... 
		modelAndView.addObject("name","priyanshu");
		modelAndView.addObject("rollnumber",123414);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
