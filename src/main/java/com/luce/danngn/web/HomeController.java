package com.luce.danngn.web;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(value = "HomeController V1")
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String home() {
        return "hello world!";
    }

    @GetMapping("/list")
    public Map<String, String> findByAll() {
        Map<String, String> result = new HashMap<>();
        result.put("author", "danngn");
        result.put("content", "테스트입니다.");

        return result;
    }
}
