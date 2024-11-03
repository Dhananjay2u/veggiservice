package com.test.tealight.tealightservice;

import com.test.tealight.tealightservice.dto.HelloDTO;
import com.test.tealight.tealightservice.web.HelloController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.apache.catalina.connector.Response;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class ApplicationTest {

    private static final String HELLO_ENDPOINT = "api/hello";

    @Value(value = "${local.server.port}")
    private int port;

    @Autowired
    private HelloController controller;	

    @Test
    void contextLoads() {
    }

    @Test
    void shouldRespondWithHelloMessage() {
    	//restTemplate.
    	HelloDTO helloDTO =controller.hello();

        assertThat(helloDTO.getMessage()).isEqualTo("Hello World!");
    }

    private String getHelloEndpointUrl() {
        return getLocalServerUrl() + HELLO_ENDPOINT;
    }

    private String getLocalServerUrl() {
        return String.format("http://localhost:%d/", port);
    }
    
   
}
