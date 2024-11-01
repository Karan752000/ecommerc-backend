package com.ecom.Capstone_Backend.Service;

import java.util.Collection;

import com.ecom.Capstone_Backend.Entity.Cart;
import com.ecom.Capstone_Backend.Entity.ProductInOrder;
import com.ecom.Capstone_Backend.Entity.User;


public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
