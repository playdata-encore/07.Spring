package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step01.biz.annotation.Car;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		
		Car car = context.getBean("biz", Car.class);
		
		String v = car.buyReturn();
	}
}
