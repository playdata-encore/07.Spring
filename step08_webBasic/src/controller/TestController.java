package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//MVC 패턴 기반의 controller 클래스를 구현하는 선언
//url 요청받고, jsp 지정 및 다이렉트로 client 브라우저에 응답
//servlet과 같은 구현 내용
//servlet - HttpServlet 상속 필수
//Spring 기반의 @Controller 만으로 일반 서블릿처럼 개발 가능
@Controller
public class TestController {

	@RequestMapping(value = "one", method = RequestMethod.GET)
	public ModelAndView m1() {
		String url = "errorView";
		ModelAndView mv = new ModelAndView();
		
		try {
			System.out.println("m1()---------------");
			mv.addObject("key", "data"); // 데이터 저장(model 저장)
			url = "finalView";
		} catch (Exception e) {
			mv.addObject("error", e.getMessage());
		}
		
		mv.setViewName(url); // jsp, 즉 실행 view 지정

		return mv; // forward 방식으로 이동
		//finalView는 반드시 데이터를 담아오는 것이 목적이기 때문에 서블릿을 통해서만 접근 가능하도록 한 것이다.
		//실제로 http://localhost/step08_webBasic/WEB-INF/finalView.jsp 로 접근하면 바로 404 뜸
	}

	@RequestMapping(value = "two")
	public String m2() {
		System.out.println("m2()---------------");
		
		return "redirect:view.jsp";
	}
}
