package step02.common.schema.around;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAspect {
	//메소드가 
	//return type=Object : 혹 return 데이터가 있는 핵심 메소드라면 공통 해당 로직 실행 후에도 반환값은 핵심 로직을
	//요청했던 곳으로 넘겨줘야 하기 때문에 Object 타입으로 리턴 설정
	public Object aroundAspect(ProceedingJoinPoint point) throws Throwable {
		//핵심로직 실행 & 예외
		System.out.println("공통1 : 구매 시작?");
		Object data = null;
		//핵심로직
		try {
			data = point.proceed(); //메소드명이 무엇이든 무조건 핵심 메소드 호출하는 절대 코드
		} catch (Throwable e) {
			System.out.println("예외 발생시 실행");
			throw e;
		}
		
		System.out.println("공통2 : 구매 완료");
		
		return data;
		
	}
}
