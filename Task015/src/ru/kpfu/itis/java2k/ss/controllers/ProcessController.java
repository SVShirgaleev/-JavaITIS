package ru.kpfu.itis.java2k.ss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by salavatshirgaleev on 01.04.16.
 */
@Controller
@RequestMapping("/process")
public class ProcessController {
    @RequestMapping(method = RequestMethod.POST)
    public String process(ModelMap modelMap, @RequestParam("action") String action, @RequestParam("text") String text) {
        if (action.equals("symbols")) {
            modelMap.put("symbol", text.length());
        }
        if (action.equals("word")) {
            modelMap.put("word", text.split(" ").length);
        }
        if (action.equals("sentence")) {
            modelMap.put("sentece", text.split(".").length);
        }
        if (action.equals("paragraph")) {
            modelMap.put("paragraph", text.split("/").length);

        }
        return "result";

    }

}
