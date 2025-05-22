package com.example.news_api.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @GetMapping
    public List<String> getNews() {
        return List.of("Leandro", "Manu", "aaa");
    }
}