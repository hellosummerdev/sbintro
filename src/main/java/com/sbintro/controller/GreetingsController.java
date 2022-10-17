package com.sbintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {

    @GetMapping("/greetings")
    public String Greetings(Model model) {
        model.addAttribute("username", "Autumn");
        return "greetings"; // 응답페이지 설정(templates/greetings.mustache -> 브라우저 전송)
    }

    @GetMapping("/goodbye")
    public String goodBye(Model model){
        model.addAttribute("nickname", "Winter");
        return "goodbye";
    }
}
