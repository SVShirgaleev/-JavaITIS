package ru.kpfu.itis.java2k.ss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by salavatshirgaleev on 31.03.16.
 */
@Controller
@RequestMapping("/getdate")
public class DateController {
    @RequestMapping(method = RequestMethod.GET)
    public String dateView(ModelMap modelMap, HttpServletRequest request){
        modelMap.put("date",new java.util.Date());
        return "date";
    }

}
