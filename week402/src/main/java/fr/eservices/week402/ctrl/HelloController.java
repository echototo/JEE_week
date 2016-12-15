package fr.eservices.week402.ctrl;

import org.springframework.ui.Model;

public class HelloController {

	public String sayHello(
			Model model, 
			String name) 
	{
		model.addAttribute("message", "Hello " + name + " !");
		return "/sample.jsp";
	}
	
	
}
