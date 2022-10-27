package ex04.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//XML ��� POJO(� �����κ��� ���ӵ��� �ʴ� ���� �ڹ�) AspectJ�� �̿��� AOP ���
public class LoggingAdvice {
	/*
	 * Aroung ����� ����/���� ó�� AOP around ������� �Ҷ���
	 * �μ��� ProceedingJoinPoint, ���� - Object �ʼ�
	 */

	public Object arround(ProceedingJoinPoint point) throws Throwable {

		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();

		System.out.println("[Log] methodName = " + methodName + " , methodName 2 = " + methodName2 + "ȣ��Ǳ� ��....");

		StopWatch sw = new StopWatch();
		sw.start(methodName);

		///////////////////// main ���ɻ�/////////////////////
		Object obj = point.proceed(); // �߻� �޼ҵ�
		//////////////////////////////////////////////////////

		System.out.println("[LOG]" + methodName2 + " ȣ�� �Ϸ� �Ǿ����ϴ�.");
		System.out.println("[LOG] ���� �ð� : " + sw.getTotalTimeMillis() / 1000 + " ��");

		return obj;
	}

}
