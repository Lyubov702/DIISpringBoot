package com.mycode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;


@RestController
public class SessionController {

    @GetMapping("/session")
    public String testSessionListener(HttpServletRequest req) {
        HttpSession session = req.getSession(true);

        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessedTime = new Date(session.getLastAccessedTime());
        String sessionId = session.getId();

        return "Creation time = " + creationTime + " , "
                + " Last access time = " + lastAccessedTime + " , "
                + "Session ID = " + sessionId;

    }

}
