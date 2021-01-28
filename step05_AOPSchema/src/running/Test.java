package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step01.biz.schema.Car;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("playdataaround.xml");
		
		Car car = context.getBean("car", Car.class);
		
//		car.buy();
		
		String data = car.buyReturn();
		System.out.println("리턴받은 데이터 : " + data);
		
		try {
			car.saleMoney(10);
		} catch (Exception e) {
			System.out.println("바깥단 예외 발생시 실행");
		}
	}
}
