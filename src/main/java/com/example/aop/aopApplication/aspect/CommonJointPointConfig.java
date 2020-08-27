package com.example.aop.aopApplication.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {
   @Pointcut("execution(* com.example.aop.aopApplication.business.*.*(..))")
   public void dataLayerExecution() {
	   
   }
   

   @Pointcut("execution(* com.example.aop.aopApplication.business.*.*(..))")
   public void businessLayerExecution() {
	   
   }
   
}
