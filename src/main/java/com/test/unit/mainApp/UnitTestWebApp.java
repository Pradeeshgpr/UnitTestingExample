package com.test.unit.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages = {"com.test.unit"})
@EnableAutoConfiguration(exclude = {JpaRepositoriesAutoConfiguration.class})
public class UnitTestWebApp {

    public static void main(String[] args) {
        SpringApplication.run(UnitTestWebApp.class);
    }
}