package org.springframework.samples.petclinic.aop.geeksforgeeks;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Logging {

    // Implementing all the five pieces of advice
    // to execute AfterThrowing advice enter integer value as 1.

    // **Before**
    @Before("execution(public void org.springframework.samples.petclinic.aop.geeksforgeeks.ImplementAspect.aspectCall())")
    public void loggingAdvice1() {
        System.out.println("Before advice is executed");
    }

    // **After**
    @After("execution(public void org.springframework.samples.petclinic.aop.geeksforgeeks.ImplementAspect.aspectCall())")
    public void loggingAdvice2() {
        System.out.println("Running After Advice.");
    }

    // **Around**
    @Around("execution(public void org.springframework.samples.petclinic.aop.geeksforgeeks.ImplementAspect.myMethod())")
    public void loggingAdvice3() {
        System.out.println("Before and After invoking method myMethod");
    }

    // **AfterThrowing**
    @AfterThrowing("execution( public void org.springframework.samples.petclinic.aop.geeksforgeeks.ImplementAspect.aspectCall())")
    public void loggingAdvice4() {
        System.out.println("Exception thrown in method");
    }

    // **AfterRunning**
    @AfterReturning("execution(public void org.springframework.samples.petclinic.aop.geeksforgeeks.ImplementAspect.myMethod())")
    public void loggingAdvice5() {
        System.out.println("AfterReturning advice is run");
    }
}
