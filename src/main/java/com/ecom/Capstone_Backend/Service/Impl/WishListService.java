package com.ecom.Capstone_Backend.Service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ecom.Capstone_Backend.Entity.OrderMain;
import com.ecom.Capstone_Backend.Entity.User;
import com.ecom.Capstone_Backend.Entity.WishList;
import com.ecom.Capstone_Backend.Repository.WishListCustomRepository;
import com.ecom.Capstone_Backend.Repository.WishListRepository;


@Service
@Transactional
public class WishListService {

    private final WishListRepository wishListRepository;
    
    @Autowired
    private WishListCustomRepository wishListCustomRepository;
    
    
    public WishListService(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    public WishList createWishlist(WishList wishList) {
    	return wishListRepository.save(wishList);
    }

    public List<WishList> readWishList(Long userId) {
		return null;
       // return wishListRepository.findAllByUserIdOrderByCreatedDateDesc(userId);
    }

	public Boolean deleteWishlist(User user, String productId) {
		return wishListCustomRepository.deleteWishlist(user,productId);
	}

	/*
	 * public Page<OrderMain> findByBuyerEmail(String name, PageRequest request) {
	 * // TODO Auto-generated method stub return
	 * wishListRepository.findAllByUserIdOrderByCreatedDateDesc(null); }
	 */

	public Page<WishList> findByBuyerEmail(Long id, PageRequest request) {
		return wishListRepository.findAllByUserId(id, request);
	}
}
