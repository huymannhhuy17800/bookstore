package com.huynm.bookstore.service.impl;

import com.huynm.bookstore.entities.OrderDetail;
import com.huynm.bookstore.service.CartService;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Component
public class CartServiceImpl implements CartService {
    Map<Integer ,OrderDetail> maps = new HashMap<>();
    @Override
    public void add(OrderDetail od) {
        OrderDetail cartItem = maps.get(od.getBook().getId());
        if(cartItem == null){
            maps.put(od.getBook().getId(),od);
        }else{
            cartItem.setQuantity(cartItem.getQuantity() + 1);
        }
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void clear() {
        maps.clear();
    }

    @Override
    public Collection<OrderDetail> getAllCartItems() {
        return maps.values();
    }

    @Override
    public OrderDetail update(int bookID, int qty) {
        return null;
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
