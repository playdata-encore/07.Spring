package model.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class Logger {
	@Around("within(model.*)")
	public Object around(ProceedingJoinPoint point) {
		log.info("[공통 1 - around] 실행 시작 기록");
		
		Object result = null;
		try {
			result = point.proceed();
		} catch (Throwable e) {
			log.warn("Around 방식으로 예외 처리로직 : " + e.getMessage());
		}
		
		log.warn("[공통 2 - around] 실행 완료 기록");
		if (result != null) {
			log.warn("[공통 3 - around] 리턴이 있다면 : " + result);
		}
		
		return result;
	}
}
