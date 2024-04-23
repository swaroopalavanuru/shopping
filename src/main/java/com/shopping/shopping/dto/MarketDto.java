package com.shopping.shopping.dto;



import com.shopping.shopping.model.Shopping;

public class MarketDto {
	 private Integer marketId;
		private String marketName;
		private Integer shoppingId;
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
		public Integer getShoppingId() {
			return shoppingId;
		}
		public void setShoppingId(Integer shoppingId) {
			this.shoppingId = shoppingId;
		}
		public MarketDto(Integer marketId, String marketName, Integer shoppingId) {
			super();
			this.marketId = marketId;
			this.marketName = marketName;
			this.shoppingId = shoppingId;
		}
		public MarketDto() {
			super();
			// TODO Auto-generated constructor stub
		}

}
