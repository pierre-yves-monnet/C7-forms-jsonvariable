package org.camunda.c7formjsonvariables;


import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication

public class C7formJsonVariable {
    public static void main(String... args) {

        SpringApplication.run(C7formJsonVariable.class, args);
    }

}
