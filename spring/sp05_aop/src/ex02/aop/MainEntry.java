package ex02.aop;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		ICalc  c = new CalcImpl();
		
		ICalc proxy = (ICalc)Proxy.newProxyInstance(
								c.getClass().getClassLoader() ,         // loader : 클래스 찾기
								c.getClass().getInterfaces()  , 			// interface : 행위(함수)
								new LogPrintHandlerImpl(c) );			// h : 보조업무 구현
		
		// 클래스 통해서 실행
		System.out.println(c.add(2, 3));
		System.out.println(c.mul(3, 5));
		System.out.println("-----------------------");
		
		// Proxy를 통해서 실행
		System.out.println(proxy.add(5, 5));
		System.out.println(proxy.sub(1, 2, 3));
		System.out.println(proxy.mul(3, 5));
	}
}
