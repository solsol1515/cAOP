package aop2_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component // 빈 생성
@Aspect // advice역할 하는 클래스임을 나타내줌(aop객체)
public class SampleAdvice {
	
	@Around("execution(public * aop2_annotation.*.*Hello(..))")
	public Object around(ProceedingJoinPoint point)throws Throwable{
		
		String methodName = point.getSignature().getName();
		System.out.println("<<<<< 사전작업 >>>>>>" + methodName);
		Object obj = point.proceed();
		System.out.println("<<<<< 사후작업 >>>>>>" + methodName);
		return obj;
		}
	
}
