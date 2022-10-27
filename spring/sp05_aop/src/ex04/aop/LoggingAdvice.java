package ex04.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//XML 기반 POJO(어떤 누구로부터 종속되지 않는 순수 자바) AspectJ를 이용한 AOP 방법
public class LoggingAdvice {
	/*
	 * Aroung 방식의 사전/사후 처리 AOP around 방식으로 할때는
	 * 인수는 ProceedingJoinPoint, 리턴 - Object 필수
	 */

	public Object arround(ProceedingJoinPoint point) throws Throwable {

		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();

		System.out.println("[Log] methodName = " + methodName + " , methodName 2 = " + methodName2 + "호출되기 전....");

		StopWatch sw = new StopWatch();
		sw.start(methodName);

		///////////////////// main 관심사/////////////////////
		Object obj = point.proceed(); // 추상 메소드
		//////////////////////////////////////////////////////

		System.out.println("[LOG]" + methodName2 + " 호출 완료 되었습니다.");
		System.out.println("[LOG] 실행 시간 : " + sw.getTotalTimeMillis() / 1000 + " 초");

		return obj;
	}

}
