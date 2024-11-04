package com.test.tealight.tealightservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.test.tealight.repository")
@ComponentScan(basePackages = "com.test.tealight")
@EntityScan("com.test.tealight.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
