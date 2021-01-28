package model;

import org.springframework.stereotype.Component;

@Component("chickenservice")
public class ChickenService {
	public void buy() {
		System.out.println("치킨 주문"); 					//biz logic
	}
	
	public void buyMoney(int money) {
		System.out.println("치킨 주문한 금액 " + money); 		//biz logic
	}

	public String buyReturn() {
		return "치킨 주문 성공";
	}
	
	//판매 금액이 1000만원 이하인 경우에 예외 발생
	public void saleMoney(int money) throws Exception {
		if(money <= 1000) {
			throw new Exception("너무 싸!!!");
		}
	}
}
