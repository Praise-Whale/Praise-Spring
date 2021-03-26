package com.praise.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/03/23
 */
@RestController
public class UserController {

    @GetMapping("/")
    public String test() {
        return "Dockerfile 추가 ~~~";
    }
}
