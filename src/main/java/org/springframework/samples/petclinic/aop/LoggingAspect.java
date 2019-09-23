package org.springframework.samples.petclinic.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

    @After("execution(* org.springframework.samples.petclinic.aop.EmployeeManagerImpl.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint) {
        System.out.println("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
    }

    @After("execution(* org.springframework.samples.petclinic.aop.EmployeeManagerImpl.getEmployeeById(..))")
    public void logAfterGetEmployee(JoinPoint joinPoint) {
        System.out.println("****LoggingAspect.logAfterGetEmployee() : " + joinPoint.getSignature().getName());
    }

    @After("execution(* org.springframework.samples.petclinic.aop.EmployeeManagerImpl.createEmployee(..))")
    public void logAfterCreateEmployee(JoinPoint joinPoint) {
        System.out.println("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
    }
}
