package step01.common.schema;

//공통 기능의 클래스
public class NoticeAspect {
	//구맨 전 처리 공통 로직
	public void noticBuyStart() {
		System.out.println("[공통 1] 구매를 시작 하실 건가요?");
	}
	
	//구매 후 처리 공통 로직
	public void noticBuyEnd() {
		System.out.println("[공통 2] 구매를 완료 하셨습니다");
	}
	
	
	//리턴시의 공통로직
	/* 메소드가 반환하는 로직을 포함한 경우에 공통적으로 처리하고자 하는 로직
	 * parameter
	 */
	public void noticReturnValue(Object value) {
		System.out.println("통일된 방식으로 리턴 처리로직 : " + value.toString());
	}
	
	//예외 반환시 공통로직
	/* 핵심로직 실행시 발생되는 예외를 일괄적으로 받아서 처리
	 * 설계 - parametor로 발생되는 예외를 받아서 처리
	 * 
	 */
	public void noticException(Exception e) {
		System.out.println("통일된 방식으로 예외 처리로직 : " + e.getMessage());
	}
	
	//예외 발생시 실행되는 공통로직
	
}
