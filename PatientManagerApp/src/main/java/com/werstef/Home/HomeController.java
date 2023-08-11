package com.werstef.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping({"/", "", "/index", "index"})
    public String getWelcomeMessage(){

        return this.homeService.getWelcomeMessage();
    }
}
