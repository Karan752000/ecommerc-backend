package com.ecom.Capstone_Backend.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.Capstone_Backend.Entity.Discount;
import com.ecom.Capstone_Backend.Repository.DiscountRepository;
import com.ecom.Capstone_Backend.Service.DiscountService;

@Service
public class DiscountServiceImpl implements DiscountService {
	
	@Autowired
	DiscountRepository discountRepository;

	@Override
	@Transactional
	public Discount createCoupon(String code) {
		Integer status=0;
		Discount coupon=new Discount();
		coupon.setId(code);
		coupon.setStatus(status.longValue());
		return discountRepository.save(coupon);
	}

	@Override
	@Transactional
	public Page<Discount> findAll(PageRequest request) {
		return discountRepository.findAll(request);
		
	}

	@Override
	@Transactional
	public void deleteCoupon(String code) {
		 discountRepository.deleteById(code);
	}

	@Override
	@Transactional
	public List<Discount> findAll() {
		return discountRepository.findAll();
	}

}
