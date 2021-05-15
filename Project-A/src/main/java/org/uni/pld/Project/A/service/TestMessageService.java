package org.uni.pld.Project.A.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestMessageService {

    @GetMapping("/")
    public String doGet() {
        return "If you see this message service was successfully started";
    }

}
