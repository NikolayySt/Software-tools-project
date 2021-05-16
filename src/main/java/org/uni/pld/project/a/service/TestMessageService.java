package org.uni.pld.project.a.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestMessageService {

    public TestMessageService() {
        System.out.println("Service initialized!");
    }

    @GetMapping
    public String doGet() {
        return "If you read this message service is deployed successfully";
    }
}
