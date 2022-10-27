package ex06.aop.annot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogApp { // Advice class - around ����

	// @Pointcut("execution(public void get*(..))") // public void�� ��� get�޼ҵ�
	// @Pointcut("execution(* ex06.aop.annot.*.*())") // kr.edu.kosta ��Ű���� �Ķ���Ͱ� ����
	// ��� �޼ҵ�
	// @Pointcut("execution(* kr.edu.kosta..*.*())") // kr.edu.kosta ��Ű�� &
	// kr.edu.kosta ���� ��Ű���� �Ķ���Ͱ� ���� ��� �޼ҵ�
	// @Pointcut("execution(* kr.edu.kosta.Worker.*())") // kr.edu.kosta.Worker ����
	// ��� �޼ҵ�

	// @Pointcut("within(ex06.aop.annot.*)") //kr.edu.kosta ��Ű�� �ȿ� �ִ� ��� �޼ҵ�
	// @Pointcut("within(ex06.aop.annot..*)") //kr.edu.kosta ��Ű�� �� ���� ��Ű�� �ȿ� �ִ� ���
	// �޼ҵ�
	// @Pointcut("within(ex06.aop.annot.Worker)") //kr.edu.kosta.Worker ��� �޼ҵ�

	// @Pointcut("bean(student)") //student �󿡸� ����
	// @Pointcut("bean(*ker)") //~ker�� ������ �󿡸� ����
	@Pointcut("!bean(student)") // student ���� ������ �Ϳ� ���� ����

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
		System.out.println(signatureStr + " ��� �ð� : " + (end - st));

		return obj;
	} // around

}
