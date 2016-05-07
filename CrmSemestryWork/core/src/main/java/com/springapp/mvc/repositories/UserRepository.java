package com.springapp.mvc.repositories;

import com.springapp.mvc.common.UserInfo;


 /**
 * Created by salavatshirgaleev on 04.05.16.
 */
public interface UserRepository {

    void add(UserInfo userInfo);

    UserInfo getUserByLogin(String login);
}
