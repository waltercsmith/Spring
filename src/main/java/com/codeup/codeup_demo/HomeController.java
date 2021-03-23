package com.codeup.codeup_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


        @GetMapping("/hello")
        @ResponseBody
        public String hello() {
            return "This is the landing page!";
        }
    }

