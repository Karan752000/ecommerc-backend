package com.ecom.Capstone_Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Capstone_Backend.Entity.Discount;
@Repository
public interface DiscountRepository extends JpaRepository<Discount, String> {

}
