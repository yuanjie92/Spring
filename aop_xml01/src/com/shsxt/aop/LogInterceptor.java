package com.shsxt.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogInterceptor {

	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method start...");
		Object obj = pjp.proceed();
		System.out.println("method end...");
		return obj;
	}
}
