package com.shsxt.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogInterception {

	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("save start...");
		Object obj = pjp.proceed();
		System.out.println("save end...");
		return obj;
	}
}
