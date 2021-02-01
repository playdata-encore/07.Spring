package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import model.domain.Customer;

@Controller
public class Step01Controller {

	// a href 
	@RequestMapping("hello1")
	public String m1() {
		
		return "redirect:step01RedirectView.jsp";
	}
	//========================================================================
	@RequestMapping("hello2")
	public ModelAndView m2() {
		String url = "step01ForwardView";
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("newData", "재웅");
		mv.setViewName(url);
		
		return mv;
	}
	//========================================================================
	@RequestMapping("hello3")
	public ModelAndView m3() throws Exception {
		System.out.println("m3");
		if(true) {
			throw new Exception("예외 처리 학습");
		}
		return null;
	}
	
	@ExceptionHandler
	public String handler(Exception e) {
		System.out.println("handler");
		System.out.println(e.getMessage());
		return "redirect:failView.jsp";
	}
	//========================================================================
	@RequestMapping("hello4")
	public String m4(RedirectAttributes attr){
		System.out.println("m4");
		attr.addAttribute("newData", "redirect이동시 전송된 데이터");
		return "redirect:step04.jsp";
	}
	
	@RequestMapping("hello5")
	public ModelAndView m5(@RequestParam("id") String id, @RequestParam("age") int age) { //parserInt 또한 포함
		System.out.println(id + age);
		ModelAndView mv = new ModelAndView();
		mv.addObject("newData", "m5 save");
		mv.setViewName("step05hello5");
		return mv;
	}
	
	/*	Controller의 메소드 parameter로 dto 선언시
	 *  - client가 전송하는 web query string key와  일치되는 변수들을 보유한 DTO인 경우
	 *  	자동생성
	 * 	- 
	 */
	@RequestMapping("hello6")
	public String m6(Customer cust) {
		System.out.println("m6()" + cust.getId());
		
		return "step01hello6"; //forward 알아서 포워드
	}
	
	/* Model - 이름처럼 데이터 표현용 API
	 * 2. 패키지 명에서 짐작컨데 화면 처리 단에서 사용된 데이터 활용 API
	 * 
	 */
	
	@RequestMapping("hello7")
	public String m7(Model model, Customer cust) {
		System.out.println("m7()" + cust.getId());
		model.addAttribute("newData", "재웅");
		return "step01hello7"; //forward 알아서 포워드
	}
	
	/*
	 * Customer c = new Customer(request.getParmeter("id"), request.getParmeter("id"))
	 */
	
	@RequestMapping("hello8")
	public String m8(@ModelAttribute("cust") Customer c) {
		System.out.println("m8()" + c.getId());
		return "step01hello8";
	}
	
}
