package com.nitin.__Spring_web_mvc_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WelcomeController {
    @GetMapping ("/welcome")
    public String welcomeMsg(){
        return "hello bro kaisi ho ";
    }
    @GetMapping ("/greet")
    public String greetMsg(){
        return "hello bro kaisi ho namaskar sabko ";
    }
}

