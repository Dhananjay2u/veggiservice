package com.test.tealight.tealightservice.web;

import com.test.tealight.tealightservice.dto.HelloDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping(path = "/hello" , produces = "application/json")
    public HelloDTO hello() {
        return new HelloDTO("Hello World!");
    }
    @GetMapping(path = "/addSubscription", produces="application/json")
    public HelloDTO addSubscriptio() {
    	return new HelloDTO("Hello World! with Added Subscription");    	
    }
}
