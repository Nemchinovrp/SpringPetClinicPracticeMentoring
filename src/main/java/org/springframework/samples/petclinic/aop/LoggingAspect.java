package org.springframework.samples.petclinic.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.List;

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
        System.out.println("joinPoint.getKind() - " + joinPoint.getKind().toString());
        System.out.println("joinPoint.getTarget() - " + joinPoint.getTarget().toString());
        System.out.println("joinPoint.getThis() - " + joinPoint.getThis().toString());
        System.out.println("joinPoint.toLongString() - " + joinPoint.toLongString());
        System.out.println("joinPoint.toShortString() - " + joinPoint.toShortString());
    }

    @After("execution(* org.springframework.samples.petclinic.aop.EmployeeManagerImpl.createEmployee(..))")
    public void logAfterCreateEmployee(JoinPoint joinPoint) {
        System.out.println("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* org.springframework.samples.petclinic.aop.EmployeeManagerImpl.findAll(..))", returning = "retVal")
    public void logAfterReturningGetEmployee(Object retVal) throws Throwable {
        System.out.println("****LoggingAspect.logAfterReturningGetEmployee() ");
        System.out.println(((List<EmployeeDTO>) retVal).size());
        System.out.println("****LoggingAspect.logAfterReturningGetEmployee() ");
    }
}
