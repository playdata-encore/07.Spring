package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.domain.Chicken1;
import model.domain.Chicken2;
import model.domain.Store;

public class Test {
	static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		
	}
	
	public static void test3 () {
		Chicken2 Chicken2 = context.getBean("chicken2", Chicken2.class);
		Store store = context.getBean("store", Store.class);
		Chicken1 Chicken1 = context.getBean("chicken1", Chicken1.class);
		
		
	}
	
	public static void test2 () {
		Store store = context.getBean("store", Store.class);
		Chicken1 Chicken1 = context.getBean("chicken1", Chicken1.class);
		
		System.out.println(store);
		System.out.println(store.getChicken1().hashCode());
		System.out.println(Chicken1.hashCode());
	}
	
	public static void test1 () {
		Chicken1 Chicken1 = context.getBean("chicken1", Chicken1.class);
		Store store = context.getBean("store", Store.class);
		
		System.out.println(store);
		System.out.println(store.getChicken1().hashCode());
		System.out.println(Chicken1.hashCode());
	}
}
