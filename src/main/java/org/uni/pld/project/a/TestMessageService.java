package org.uni.pld.project.a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestMessageService {

    @GetMapping
    public String doGet() {
        return "If you read this message service is deployed successfully";
    }
}
