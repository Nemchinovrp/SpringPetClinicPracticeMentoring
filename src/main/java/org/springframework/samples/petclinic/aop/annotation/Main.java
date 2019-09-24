package org.springframework.samples.petclinic.aop.annotation;

import org.springframework.stereotype.Service;

@Service
public class Main {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 8));
    }
}

