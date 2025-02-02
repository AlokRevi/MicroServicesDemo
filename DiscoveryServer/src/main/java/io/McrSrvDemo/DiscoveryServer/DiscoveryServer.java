package io.McrSrvDemo.DiscoveryServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DiscoveryServer {

    public static void main(String[] args) {
        System.out.println("DiscoveryServer starting...");
    }

}
