package com.huynm.bookstore.service;

import com.huynm.bookstore.entities.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface CartService {
    void add(OrderDetail od);
    void remove(int id);
    void clear();
    Collection<OrderDetail> getAllCartItems();
    OrderDetail update(int bookID, int qty);

    double getAmount();
}
