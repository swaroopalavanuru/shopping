package com.shopping.shopping.dto;

import javax.persistence.Column;

public class ShoppingDto {
	private Integer shoppingId;
	public ShoppingDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShoppingDto(Integer shoppingId, String shoppingName) {
		super();
		this.shoppingId = shoppingId;
		this.shoppingName = shoppingName;
	}
	public Integer getShoppingId() {
		return shoppingId;
	}
	public void setShoppingId(Integer shoppingId) {
		this.shoppingId = shoppingId;
	}
	public String getShoppingName() {
		return shoppingName;
	}
	public void setShoppingName(String shoppingName) {
		this.shoppingName = shoppingName;
	}
	private String shoppingName;
}
