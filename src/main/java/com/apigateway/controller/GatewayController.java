package com.apigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gateway")
public class GatewayController {

    @GetMapping
    public ResponseEntity<String> gatewayHome() {
        return ResponseEntity.ok("API Gateway is running");
    }
}