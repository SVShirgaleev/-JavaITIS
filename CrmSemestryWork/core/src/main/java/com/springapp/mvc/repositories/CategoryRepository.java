package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CategoryInfo;

import java.util.ArrayList;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
public interface CategoryRepository {

    void addCategory(CategoryInfo categoryInfo);

    ArrayList<CategoryInfo> getCategoryByID();

}
