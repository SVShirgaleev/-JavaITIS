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
@RequestMapping("/add/*/*")
public class AddController {
    @RequestMapping(method = RequestMethod.GET)
    public String addView(ModelMap model, HttpServletRequest request){
        Pattern p = Pattern.compile(".*/add/([0-9]+)/([0-9]+)");
        Matcher m = p.matcher(request.getRequestURI());
        if(m.find()){
            int x = new Integer(m.group(1));
            int y = new Integer(m.group(2));
            model.put("addition",(x+y));
        }
        return "adding";
    }
}
