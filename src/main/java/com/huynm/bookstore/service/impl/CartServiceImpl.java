package com.huynm.bookstore.service.impl;

import com.huynm.bookstore.entities.OrderDetail;
import com.huynm.bookstore.service.CartService;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Component
public class CartServiceImpl implements CartService {
    public static Map<Integer ,OrderDetail> carts = new HashMap<>();

    public static Map < Integer, OrderDetail > getCart() {
        return carts;
    }

    // Put data in global cache variable
    public static void putCart(Integer key, OrderDetail value) {
        carts.put(key, value);
    }
    @Override
    public void add(OrderDetail od) {
        OrderDetail cartItem = carts.get(od.getBook().getId());
        if(cartItem == null){
            putCart(od.getBook().getId(),od);
        }else{
            cartItem.setQuantity(cartItem.getQuantity() + 1);
        }
    }

    @Override
    public void remove(int id) {
        OrderDetail cartItems = carts.get(id);
        cartItems.setQuantity(cartItems.getQuantity() - 1);
        if(cartItems.getQuantity() == 0){
            carts.remove(id);
        }
    }

    @Override
    public void clear() {
        carts.clear();
    }

    @Override
    public Collection<OrderDetail> getAllCartItems() {
        return carts.values();
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
