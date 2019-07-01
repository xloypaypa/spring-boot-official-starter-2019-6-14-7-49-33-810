package com.oocl.web.sampleWebApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity addUser(@RequestBody String username, HttpServletResponse response) {
        String id = "1";
        response.setHeader("Location", "/users/" + id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}