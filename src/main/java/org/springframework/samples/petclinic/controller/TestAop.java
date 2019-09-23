package org.springframework.samples.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.aop.EmployeeManager;
import org.springframework.samples.petclinic.aop.geeksforgeeks.ImplementAspect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAop {
    @Autowired
    private EmployeeManager manager;
    @Autowired
    ImplementAspect implementAspect;

    @GetMapping("/aop")
    public void testAop() throws Exception {
        manager.getEmployeeById(1);
    }

    @GetMapping("/geeks")
    public void test() {
        implementAspect.aspectCall();
        implementAspect.myMethod();
    }
}
