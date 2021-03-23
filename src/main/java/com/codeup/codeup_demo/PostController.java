package com.codeup.codeup_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String hello() {
        return "posts index page";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String viewIndividualPost() {
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewForm(){
        return "view the form for creating a post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createNewPost(){
        return "create a new post";
    }


}
