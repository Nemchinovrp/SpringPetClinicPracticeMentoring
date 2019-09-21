package org.springframework.samples.petclinic.controller;

import org.springframework.samples.petclinic.exception.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ExceptionHandlerController {
    @GetMapping("/test")
    public void test() throws MyException {
        throw new MyException();
    }

    @ExceptionHandler(Exception.class)
    public void handleError(HttpServletRequest req, Exception ex) {
        System.out.println("Find Error!!!");
    }
}
