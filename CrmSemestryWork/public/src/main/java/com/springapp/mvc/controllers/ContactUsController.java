package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by salavatshirgaleev on 07.05.16.
 */
@Controller
@RequestMapping("/contact")
public class ContactUsController {
    @RequestMapping(method = RequestMethod.GET)
    public String contact(){
        return "contact-us";
    }

}
