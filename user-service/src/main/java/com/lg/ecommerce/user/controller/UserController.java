
package com.lg.ecommerce.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/test")
    public Map<String, String> test() {
        return Map.of(
                "message", "User Service is running successfully"
        );
    }
}
