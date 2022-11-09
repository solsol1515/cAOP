package aop1_xml;

import org.aspectj.lang.JoinPoint;

public class LoggingAdvice {
	
	public void before(JoinPoint point)throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[**** 사전 작업 ****] " + methodName);
	}
	
	public void after(JoinPoint point)throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[**** 사후 작업 ****] " + methodName);
	}
	
}
