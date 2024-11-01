package com.ecom.Capstone_Backend.Service;

import java.util.List;

import com.ecom.Capstone_Backend.Entity.ProductCategory;


public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
