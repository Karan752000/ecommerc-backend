package com.ecom.Capstone_Backend.Service;

import com.ecom.Capstone_Backend.Entity.ProductInOrder;
import com.ecom.Capstone_Backend.Entity.User;


public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
