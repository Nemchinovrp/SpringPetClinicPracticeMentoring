package org.springframework.samples.petclinic.aop.annotation;

import org.springframework.stereotype.Service;

@Service
public class Main {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }
}

