package ex05.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LogPrintAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(
						Object returnValue, 
						Method method, 
						Object[] args, 
						Object target)	throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("AfterreturningAdvice Start");
		Log log = LogFactory.getLog(this.getClass());
		log.info("[�־��� ����ǰ� ���ƿͼ� �ٷ� ����]");
		log.info("[AfterReturnig Method] : " +  method.getName());
		log.info("[Return value] : " +  returnValue);
		log.info("[args value] : " +  Arrays.toString(args));

	}

}
