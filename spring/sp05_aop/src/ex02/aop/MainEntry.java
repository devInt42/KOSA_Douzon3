package ex02.aop;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		ICalc  c = new CalcImpl();
		
		ICalc proxy = (ICalc)Proxy.newProxyInstance(
								c.getClass().getClassLoader() ,         // loader : Ŭ���� ã��
								c.getClass().getInterfaces()  , 			// interface : ����(�Լ�)
								new LogPrintHandlerImpl(c) );			// h : �������� ����
		
		// Ŭ���� ���ؼ� ����
		System.out.println(c.add(2, 3));
		System.out.println(c.mul(3, 5));
		System.out.println("-----------------------");
		
		// Proxy�� ���ؼ� ����
		System.out.println(proxy.add(5, 5));
		System.out.println(proxy.sub(1, 2, 3));
		System.out.println(proxy.mul(3, 5));
	}
}
