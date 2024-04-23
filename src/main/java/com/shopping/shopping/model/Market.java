package com.shopping.shopping.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "market")
public class Market {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="market_id")
 private Integer marketId;
	@Column(name = "market_name",nullable=false)
	private String marketName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="shopping_id",nullable=false)
	private Shopping shop;
	public Market() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Market(Integer marketId, String marketName, Shopping shop) {
		super();
		this.marketId = marketId;
		this.marketName = marketName;
		this.shop = shop;
	}
	public Integer getMarketId() {
		return marketId;
	}
	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public Shopping getShop() {
		return shop;
	}
	public void setShop(Shopping shop) {
		this.shop = shop;
	}
}
