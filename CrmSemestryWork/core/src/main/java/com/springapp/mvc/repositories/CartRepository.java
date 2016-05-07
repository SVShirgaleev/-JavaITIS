package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

/**
 * Created by salavatshirgaleev on 06.05.16.
 */
public interface CartRepository {
     void addItem(GoodInfo goodInfo);
    void deleteItem(Long goodId);

}
