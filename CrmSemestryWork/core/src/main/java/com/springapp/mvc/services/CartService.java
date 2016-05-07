package com.springapp.mvc.services;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Transactional
    public void addItem(GoodInfo goodInfo){
        cartRepository.addItem(goodInfo);
    }

    @Transactional
    public void deleteItem(Long goodId){
        cartRepository.deleteItem(goodId);
    }


    /**
     * Добавление товара в корзину
     */
   /* public void addInCart(HttpSession session, Long goodId, Integer count) {
        CartInfo cart = (CartInfo) session.getAttribute(Constants.SESSION_CART);
        if (cart == null) {
            cart = new CartInfo();
        }
        if (cart.getGoods() == null) {
            Map<Long, Integer> map = new HashMap<Long, Integer>();
            map.put(goodId, count);
            cart.setGoods(map);
        } else {
            if (cart.getGoods().containsKey(goodId)) {
                cart.getGoods().put(goodId, cart.getGoods().get(goodId) + count);
            } else {
                cart.getGoods().put(goodId, count);
            }
        }
        session.setAttribute(Constants.SESSION_CART, cart);
    }*/
}
