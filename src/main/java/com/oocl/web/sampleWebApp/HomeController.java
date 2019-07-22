package com.oocl.web.sampleWebApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @GetMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @PostMapping("/users")
    public ResponseEntity addUser() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}