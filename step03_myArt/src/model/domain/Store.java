package model.domain;

import org.springframework.beans.factory.annotation.Autowired;
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

@Component
public class Store {
	private String name;
	private Chicken1 chicken1;
	private Chicken2 chicken2;
	
	@Autowired
	public void Store (Chicken1 chicken1, Chicken2 chicken2) {
		this.chicken1 = chicken1;
		this.chicken2 = chicken2;
	}
}
