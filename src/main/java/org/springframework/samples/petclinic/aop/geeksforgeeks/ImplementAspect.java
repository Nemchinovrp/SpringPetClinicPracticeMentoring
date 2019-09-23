package org.springframework.samples.petclinic.aop.geeksforgeeks;

import org.springframework.stereotype.Service;

@Service
public class ImplementAspect {

    public void aspectCall() {
        System.out.println("Applying advices for the first time");
    }

    public void myMethod() {
        System.out.println("This is an extra method");
    }
}
