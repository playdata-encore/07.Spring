package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Customer {
	private String id;
	private int age;
	
	public Customer() {
		System.out.println("Customer()");
	}
}
