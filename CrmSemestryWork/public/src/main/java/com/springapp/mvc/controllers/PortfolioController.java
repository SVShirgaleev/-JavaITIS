package com.springapp.mvc.controllers;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.services.CategoryService;
import com.springapp.mvc.services.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Controller
@RequestMapping("/portfolio")
public class PortfolioController {
    @Autowired
    private GoodService goodService;

    @Autowired
    private CategoryService categoryService;




    @RequestMapping(method = RequestMethod.GET)
    public String portfolio(ModelMap modelMap){
        List<GoodInfo> goodInfos = new ArrayList<GoodInfo>();
        goodInfos.addAll(goodService.getAll());

        modelMap.addAttribute("good",goodInfos);


        /*ArrayList<CategoryInfo> category = new ArrayList<CategoryInfo>();
        category.addAll(categoryService.getCategory());

        modelMap.addAttribute("category", category);*/

        return "portfolio";
    }


   /* @RequestMapping(method = RequestMethod.GET)
    public String categoryGood(ModelMap modelMap){
        List<GoodInfo> list = new ArrayList<GoodInfo>();
        //list.addAll(goodService.getGoodByCategory());
        return null;
    }
*/

   /* @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addToCart( Long id){
        cartService.addInCart(httpRequest.getSession(),id,1);
        return "redirect:/cart";
    }*/




}
