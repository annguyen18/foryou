package com.runnertech.ForYou;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/loveu")
    public String showPage() {
        return "loveu";
    }

    @GetMapping("/hello")
    public String showPage1() {
        return "hello";
    }
}
