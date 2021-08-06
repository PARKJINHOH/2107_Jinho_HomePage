package com.jinho.homepage.controller;

import com.jinho.homepage.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/")
    public String getMainPage() {
        return "/mainPage/mainPage";
    }

    @GetMapping("/forum")
    public String getForumPage() {
        return "/subPage/forumPage";
    }

}
