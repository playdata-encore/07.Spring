package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Step02URITemplate {
	@RequestMapping("urlTest/{id}")
	public String urlTest(@PathVariable String id) {
		System.out.println("urlTest() " + id);
		
		
		return"forward:/step02url.jsp";
		
//		return "redirect:/step02url.jsp";
	}
	
	@RequestMapping("urlTest/{id}/encore/{age}")
	public String urlTest(@PathVariable String id, @PathVariable int age) {
		System.out.println("urlTest() " + id + " " + age);
		
		return"forward:/step02url.jsp";
		
//		return "redirect:/step02url.jsp";
	}
}
