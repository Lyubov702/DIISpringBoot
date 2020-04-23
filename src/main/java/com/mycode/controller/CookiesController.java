package com.mycode.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class CookiesController {
    @GetMapping("/readCookie")
    public String readCookie(@CookieValue(value = "user", defaultValue = "Lyuba") String userName) {
        return "Hey! My name is " + userName;
    }

    @GetMapping("/readAllCookies")
    public String readAllCookies(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null)
            return Arrays.stream(cookies).map(cookie ->
                    cookie.getName() + "=" + cookie.getValue()).collect(Collectors.joining(", "));
        else
            return "No Cookies";
    }
}
