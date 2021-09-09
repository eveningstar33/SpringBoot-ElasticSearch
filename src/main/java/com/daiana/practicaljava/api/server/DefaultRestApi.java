package com.daiana.practicaljava.api.server;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.time.LocalTime;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {

    @GetMapping(value = "/welcome", produces = MediaType.APPLICATION_JSON_VALUE)
    public String welcome() {
        return "Welcome to Spring Boot Updated!";
    }

    @GetMapping(value = "/time")
    public String time() {
        return LocalTime.now().toString();
    }
}
