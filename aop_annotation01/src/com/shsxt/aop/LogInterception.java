package com.shsxt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInterception {

	@Pointcut("execution(* com.shsxt.service.*.save(..))")
	public void myMethod() {
	}

	@Around("myMethod()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method start...");
		Object obj = pjp.proceed();
		System.out.println("method end...");
		return obj;
	}
}
