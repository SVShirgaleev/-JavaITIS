package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.GoodRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Repository
public class GoodRepositoryHibernate implements GoodRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addGood(GoodInfo goodInfo) {
        curSession().save(goodInfo);
    }

    @Override
    public void updateGood(GoodInfo goodInfo) {
        curSession().update(goodInfo);
    }

    @Override
    public void deleteGood(Long goodId) {
        curSession().delete(new GoodInfo(goodId));
    }

    @Override
    public GoodInfo getGoodById(Long goodId) {

        return (GoodInfo) curSession().get(GoodInfo.class, goodId);
    }

    @Override
    public List<GoodInfo> getAllGood() {
        return sessionFactory.getCurrentSession().createCriteria(GoodInfo.class).list();
    }

    @Override
    public List<GoodInfo> getGoodByCategory(Long categoryId) {
        //String queryS = "SELECT DISTINCT a FROM h_goods a WHERE a.categoryID:=categoryN";

        //Query query = getEntityManager().createQuery(queryS);
        //System.out.println(sessionFactory.getCurrentSession().createCriteria(GoodInfo.class, 2).list());
        return sessionFactory.getCurrentSession().createCriteria(GoodInfo.class, String.valueOf(categoryId)).list();
    }
}
