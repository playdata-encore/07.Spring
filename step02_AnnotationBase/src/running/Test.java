package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.domain.Car;
import model.domain.Customer;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		
		//step02
		Customer cust1 = context.getBean("customer", Customer.class);
//		Car c1 = context.getBean("c", Car.class);
		
		System.out.println(cust1);
		System.out.println(cust1.hashCode());
		System.out.println(cust1.getCar());
		System.out.println(cust1.getCar2());
		System.out.println(cust1.getCar().hashCode());
		System.out.println(cust1.getCar2().hashCode());
		
		
	}
}
