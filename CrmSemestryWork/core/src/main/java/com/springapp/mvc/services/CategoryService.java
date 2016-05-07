package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created by salavatshirgaleev on 05.05.16.
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;



    @Transactional
    public ArrayList<CategoryInfo> getCategory(){
        return categoryRepository.getCategoryByID();
    }





}
