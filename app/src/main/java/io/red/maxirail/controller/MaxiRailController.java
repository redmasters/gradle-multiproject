package io.red.maxirail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxiRailController {
    @GetMapping("/")
    public String index() {
        return "MaxiRail API";
    }
}
