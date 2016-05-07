package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Controller
@RequestMapping("/about")
public class AboutUsController {
    @RequestMapping(method = RequestMethod.GET)
    public String about(){
        return "about-us";
    }
}
