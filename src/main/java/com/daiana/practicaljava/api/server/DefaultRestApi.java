package com.daiana.practicaljava.api.server;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalTime;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {

    private Logger LOG = LoggerFactory.getLogger(DefaultRestApi.class);

    @GetMapping(value = "/welcome", produces = MediaType.APPLICATION_JSON_VALUE)
    public String welcome() {
        LOG.info(String.join("Hello, ", "this is ", "Spring Boot " , "API!"));
        return "Welcome to Spring Boot Updated!";
    }

    @GetMapping(value = "/time")
    public String time() {
        return LocalTime.now().toString();
    }
}
