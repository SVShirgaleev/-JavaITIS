package ru.kpfu.itis.java2k.ss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by salavatshirgaleev on 31.03.16.
 */
@Controller
@RequestMapping("/search/*")
public class SearchController {
    @RequestMapping(method = RequestMethod.GET)
    public String searchView(ModelMap modelMap, HttpServletRequest request) {
        Pattern p = Pattern.compile("/search/google");
        Matcher m = p.matcher(request.getRequestURI());
        Pattern p2 = Pattern.compile("/search/yandex");
        Matcher m2 = p2.matcher(request.getRequestURI());


        if (m.find()) {
            return "redirect:" + "http://wwwgoogle.com";
        }
        if (m2.find()) {
            return "redirect:" + "http://www.yandex.ru";
        }

        return null;
    }

}
