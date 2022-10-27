package ex06.aop.annot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogApp { // Advice class - around 적용

	// @Pointcut("execution(public void get*(..))") // public void인 모든 get메소드
	// @Pointcut("execution(* ex06.aop.annot.*.*())") // kr.edu.kosta 패키지에 파라미터가 없는
	// 모든 메소드
	// @Pointcut("execution(* kr.edu.kosta..*.*())") // kr.edu.kosta 패키지 &
	// kr.edu.kosta 하위 패키지에 파라미터가 없는 모든 메소드
	// @Pointcut("execution(* kr.edu.kosta.Worker.*())") // kr.edu.kosta.Worker 안의
	// 모든 메소드

	// @Pointcut("within(ex06.aop.annot.*)") //kr.edu.kosta 패키지 안에 있는 모든 메소드
	// @Pointcut("within(ex06.aop.annot..*)") //kr.edu.kosta 패키지 및 하위 패키지 안에 있는 모든
	// 메소드
	// @Pointcut("within(ex06.aop.annot.Worker)") //kr.edu.kosta.Worker 모든 메소드

	// @Pointcut("bean(student)") //student 빈에만 적용
	// @Pointcut("bean(*ker)") //~ker로 끝나는 빈에만 적용
	@Pointcut("!bean(student)") // student 빈을 제외한 것에 적용 적용

	public void pointCutMethod() {

	}

	@Around("pointCutMethod()")
	public Object loggerApp(ProceedingJoinPoint point) throws Throwable {

		String signatureStr = point.getSignature().toLongString();
		System.out.println(signatureStr + " is start.......");
		System.out.println("around advice!!!!");
		long st = System.currentTimeMillis();

		Object obj = point.proceed();

		long end = System.currentTimeMillis();
		System.out.println(signatureStr + " is finished");
		System.out.println(signatureStr + " 경과 시간 : " + (end - st));

		return obj;
	} // around

}
