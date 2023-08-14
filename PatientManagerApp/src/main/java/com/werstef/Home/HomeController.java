package com.werstef.Home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping({"/", "", "/index", "index"})
    public String getWelcomeMessage(){

        return this.homeService.getWelcomeMessage();
    }
}
