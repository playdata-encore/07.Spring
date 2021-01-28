package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.ChickenService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ChickenService chicken = context.getBean("chickenservice", ChickenService.class);
		
		chicken.buy();
		System.out.println("===============================");
		try {
			chicken.saleMoney(100);
		} catch (Exception e) {
		}
		System.out.println("===============================");
		try {
			chicken.saleMoney(5000);
		} catch (Exception e) {
		}
		System.out.println("===============================");
		chicken.buyReturn();
	}
}
