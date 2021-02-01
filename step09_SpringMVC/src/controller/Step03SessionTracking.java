package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import model.domain.Customer;

@Controller
@RequestMapping("sessiontracking")
//세션에서 사용하고자 하는 key들을 명시적으로 선언 - 생략시 세션 자체 사용 불가라고 해도 관언이 아님 
//@ModelAttribute("id") String id, @ModelAttribute("age") int age 이런식으로 쓰고싶을꺼 아녀
@SessionAttributes({"id", "age", "newData", "cust"})
public class Step03SessionTracking {

	//쿠키 정보를 스프링에서 활용 가능
	@RequestMapping("/cookietest")
	public String cookietest(@CookieValue("id") String test) {
		System.out.println("m1" + test);
		
		return "redirect:/step03cookieView.jsp";
	}
	
	//Spring controller 개발시에 일관성 있게 애노테이션
	@RequestMapping("/sessionTest1")
	public String sessionTest1(HttpSession session) {
		System.out.println("m1" + session.getAttribute("id"));
		session.setAttribute("newData", "kju");
		return "redirect:/step03cookieView.jsp";
	}
	
	//이 코드의 관점
	// @ModelAttribute("id") String id
	//	-HttpSession 객체로부터 getAttribute("id")
	// 해서 받아놓은거야
	@RequestMapping("/sessionTest2")
	public String sessionTest2(@ModelAttribute("ida") String id, @ModelAttribute("age") int age) {
		System.out.println("m4()" + id + " " + age);
		
		return "redirect:/step03cookieView.jsp";
	}
	
	//@SessionAttributes({"cust"})
	//Model API는 - request에 붙었다가 session 에 붙었다가 둘중에 하나에 달라붙는다.
	@RequestMapping("/sessionTest3DTO")
	public String sessionTest3DTO(Model model, Customer cust) { //request에서 썼던 방식과 동일하지만 session화
		model.addAttribute("cust", cust);
		System.out.println("m4()" + cust.getId() + " " + cust.getAge());
		
		return "redirect:/step03cookieView.jsp";
	}
	
	@RequestMapping("/sessionDelete")
	public String sessionDelete(HttpSession session) {
		System.out.println("sessionDelete");
		session.invalidate();
		session = null;
		return "redirect:/step03cookieView.jsp";
	}
	
	//걍 이거 써..
	@RequestMapping("/sessionDelete2")
	public String sessionDelete2(SessionStatus status) {
		System.out.println("sessionDelete2");
		status.setComplete();
		return "redirect:/step03cookieView.jsp";
	}
}
