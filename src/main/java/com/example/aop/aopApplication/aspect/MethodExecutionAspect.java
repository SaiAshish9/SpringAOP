package com.example.aop.aopApplication.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionAspect {
  private Logger logger=LoggerFactory.getLogger(this.getClass());	
 
 @AfterReturning(
 returning="result",	  
 value="execution(* com.example.aop.aopApplication.business.*.*(..))")
  public void afterReturning(JoinPoint joinPoint,Object result) {	  
	  logger.info("{} returned with value {}",joinPoint,result);
  }	
 
 @AfterThrowing(
 throwing="result",	  
 value="execution(* com.example.aop.aopApplication.business.*.*(..))")
  public void afterThrowing(JoinPoint joinPoint,Object result) {	  
	  logger.info("{} returned with value {}",joinPoint,result);
  }	

 @After(
 value="execution(* com.example.aop.aopApplication.business.*.*(..))")
  public void after(JoinPoint joinPoint) {	  
	  logger.info("{} returned with value {}",joinPoint);
  }	
 
}
