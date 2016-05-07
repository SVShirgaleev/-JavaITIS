package com.springapp.mvc.controllers;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Controller
public class MainController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/index",  method = RequestMethod.GET)
	public String renderMain(ModelMap model) {
		//List<CategoryInfo> categoryInfoList = new  ArrayList<CategoryInfo>();
      //  CategoryService.getAllCategory().clone(CategoryService.getAllCategory());

        ArrayList<CategoryInfo> category = new ArrayList<CategoryInfo>();
                category.addAll(categoryService.getCategory());

		model.addAttribute("category", category);
		return "index";
	}




}