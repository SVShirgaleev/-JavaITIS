package com.springapp.mvc.common;

import javax.persistence.*;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Entity
@Table(name = "h_cart")
public class CartInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "good_id")
    private GoodInfo goodInfo;

    private Long quantity;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInfo userInfo;


    public CartInfo(){

    }

    public CartInfo(GoodInfo goodInfo, Long quantity, UserInfo userInfo) {
        this.goodInfo = goodInfo;
        this.quantity = quantity;
        this.userInfo = userInfo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GoodInfo getGoodInfo() {
        return goodInfo;
    }

    public void setGoodInfo(GoodInfo goodInfo) {
        this.goodInfo = goodInfo;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }


}
