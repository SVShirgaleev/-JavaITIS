package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

import java.util.List;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
public interface GoodRepository {

    void addGood(GoodInfo goodInfo);

    void updateGood(GoodInfo goodInfo);

    void deleteGood(Long goodId);

    GoodInfo getGoodById(Long goodId);

    List<GoodInfo> getAllGood();


    List<GoodInfo> getGoodByCategory(Long categoryId);


}


