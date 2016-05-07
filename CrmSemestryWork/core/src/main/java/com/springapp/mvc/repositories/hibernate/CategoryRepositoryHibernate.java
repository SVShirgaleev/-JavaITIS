package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.repositories.CategoryRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Repository
public class CategoryRepositoryHibernate implements CategoryRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addCategory(CategoryInfo categoryInfo) {
        curSession().save(categoryInfo);
    }

    @Override
    public ArrayList<CategoryInfo> getCategoryByID() {
        ArrayList<CategoryInfo> arrayList = new ArrayList<CategoryInfo>();
        Long i=1L;
        while (i<10) {

            arrayList.add((CategoryInfo) curSession().get(CategoryInfo.class,i));
            i++;
        }
        return arrayList;
    }




}
