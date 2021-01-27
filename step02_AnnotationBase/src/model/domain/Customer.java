package model.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//step01 - lombok 사용으로 Customer의 Car 타입의 변수엔 대입 불가
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

//step02 - Car 스프링 빈을 Customer 스프링 빈에게 주입하는 애노테이션

// 스프링 빈 등록 기술 : 생성자 주입 또는 프로퍼티 주입

@Component
public class Customer {
	private String name;
	private int age;
	@Autowired
	private Car car;
	@Autowired
	private Car2 car2;

	// autowired 는 객체에 해도 되고, set에 해도 되고 그거만 있는 생성자에 해도 됨
//	@Autowired
//	public void Customer(Car car, Car2 car2) {
//		this.car = car;
//		this.car2 = car2;
//	}
}
