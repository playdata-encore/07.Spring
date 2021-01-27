package model.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

//@Component //<bean id="car" class"model.domain.Car/>
@Component("c")
public class Car {
	private String carName;
	private int carNumber;
}
