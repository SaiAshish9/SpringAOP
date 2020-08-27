package com.example.aop.aopApplication.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
  private Logger logger=LoggerFactory.getLogger(this.getClass());	
//  intercept all methods within package 
//  @Before("execution(* com.example.aop.aopApplication.business..*.*(..))")

// PointCut->  Expression which defines what kind of methods needs to be executed is called a point-cut 
  @Before("com.example.aop.aopApplication.aspect.CommonJointPointConfig.dataLayerExecution()")
  public void before(JoinPoint joinPoint) {
//	  Advice -> What should I do when after interception of method
//	  Advice + PointCut = Aspect
	  
//	  process of implementing aop methods calls -> weaving
//	  framework which implements it weaver
	  
	  logger.info("Check for user access");
//	  Security at one place
	  logger.info("Intercepted Method Calls-{}",joinPoint);
  }		
}
