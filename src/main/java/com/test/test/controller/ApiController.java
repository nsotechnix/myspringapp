package com.test.test.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/api/health")
    public ResponseEntity<?> healthcheck(){
        return  ResponseEntity.ok("Works successfully 3");
    }
}
