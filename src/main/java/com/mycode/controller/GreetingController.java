package com.mycode.controller;

import com.mycode.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String GreetingForm(Model model){
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, HttpServletResponse resp){
        Cookie cookie = new Cookie("user",greeting.getUser() );
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);
        return "result";
    }
}
