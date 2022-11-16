package com.niit.jdp;

import com.niit.jdp.config.EmployeeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Creating a Spring container and loading the configuration from the EmployeeConfig class.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

    }
}
