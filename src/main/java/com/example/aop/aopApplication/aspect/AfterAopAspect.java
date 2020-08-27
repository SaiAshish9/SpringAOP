package com.example.aop.aopApplication.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
  private Logger logger=LoggerFactory.getLogger(this.getClass());	
 
 @Around("execution(* com.example.aop.aopApplication.business.*.*(..))")
  public void around(ProceedingJoinPoint jointPoint) throws Throwable {	  
	 long startTime=System.currentTimeMillis();
	 jointPoint.proceed();
	 long timeTaken=System.currentTimeMillis()-startTime;
	 logger.info("Time Taken by {} is {}",jointPoint,timeTaken);
  }	
}
