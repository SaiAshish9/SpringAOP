package com.example.aop.aopApplication.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {
   @Pointcut("execution(* com.example.aop.aopApplication..*.*(..))")
   public void dataLayerExecution() {
	   
   }
   

   @Pointcut("execution(* com.example.aop.aopApplication.business.*.*(..))")
   public void businessLayerExecution() {
	   
   }
   
  @Pointcut("dataLayerExecution() && businessLayerExecution()")
  public void allLayerExecution() {}
  
//  any beans containing dao
  @Pointcut("bean(*dao*)")
  public void beanStartingWithDao() {}
 
  @Pointcut("within(com.example.aop.aopApplication.data..*)")
  public void dataLayerExecutionWithWithin() {}

  @Pointcut("@annotation(com.example.aop.aopApplication.data.TrackTime)")
  public void trackTimeAnnotation() {}
  
}
