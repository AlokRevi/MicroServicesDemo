package io.McrSrvDemo.Orders.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class Orders {

    @GetMapping("/hello")
    public String Hello() {

        return "hello from Orders is working ";

    }
}
