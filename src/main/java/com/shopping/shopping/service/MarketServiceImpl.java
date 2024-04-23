package com.shopping.shopping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shopping.dao.MarketRepository;
import com.shopping.shopping.dao.ShoppingRepository;
import com.shopping.shopping.dto.MarketDto;
import com.shopping.shopping.model.Market;

@Service
public class MarketServiceImpl implements MarketService {
	@Autowired
	private MarketRepository marketrepository;
	@Autowired
	private ShoppingRepository shoppingrepository;

	@Override
	public Object create(MarketDto marketdto) {
		Optional<com.shopping.shopping.model.Shopping> option = shoppingrepository.findById(marketdto.getShoppingId());
		if(option.isEmpty())
		{
			return "id is not found";
		}
		Market market = new Market();
		market.setMarketId(marketdto.getMarketId());
		market.setMarketName(marketdto.getMarketName());
		market.setShop(option.get());
		marketrepository.save(market);
		
		return marketdto;
	}

	@Override
	public Object update(MarketDto marketdto) {
		Optional<com.shopping.shopping.model.Shopping> option = shoppingrepository.findById(marketdto.getShoppingId());
		if(option.isEmpty())
		{
			return "id is not found";
		}
		Market market = new Market();
		market.setMarketId(marketdto.getMarketId());
		market.setMarketName(marketdto.getMarketName());
		market.setShop(option.get());
		marketrepository.save(market);
		
		return marketdto;
	}

}
