package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.CartRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by salavatshirgaleev on 06.05.16.
 */
@Repository
public class CartRepositoryHibernate implements CartRepository {
    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addItem(GoodInfo goodInfo) {
        curSession().save(goodInfo);
    }

    @Override
    public void deleteItem(Long goodId) {
        curSession().delete(goodId);
    }
}
