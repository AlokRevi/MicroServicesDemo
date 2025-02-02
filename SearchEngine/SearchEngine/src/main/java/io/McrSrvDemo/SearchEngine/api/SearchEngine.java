package io.McrSrvDemo.SearchEngine.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searchengine")
public class SearchEngine {

    @GetMapping("/search")
    public String SearchProduct() {
        return "SearchEngine is running";
    }

}
