package com.ecom.Capstone_Backend.Response;

import java.util.List;

import com.ecom.Capstone_Backend.Entity.ProductInfo;

public class ProductInfoResponse {
	
	private List<ProductInfo> productList;

	public List<ProductInfo> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductInfo> productList) {
		this.productList = productList;
	}
	

}
