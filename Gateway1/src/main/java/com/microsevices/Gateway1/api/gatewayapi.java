package com.microsevices.Gateway1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class gatewayapi {
    @GetMapping("/hello")
    public String result(){
        return "Hello World";
    }
}
