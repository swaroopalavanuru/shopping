package com.shopping.shopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="shopping")
public class Shopping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="shopping_id")
	private Integer shoppingId;
	@Column(name ="shopping_name",nullable=false)
	private String shoppingName;
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
	public Shopping(Integer shoppingId, String shoppingName) {
		super();
		this.shoppingId = shoppingId;
		this.shoppingName = shoppingName;
	}
	public Shopping() {
		super();
		// TODO Auto-generated constructor stub
	}

}
