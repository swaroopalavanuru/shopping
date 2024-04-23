package com.shopping.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shopping.dao.ShoppingRepository;
import com.shopping.shopping.dto.ShoppingDto;
import com.shopping.shopping.model.Shopping;

@Service
public class ShoppingServiceImpl implements ShoppingService {
	@Autowired
	private ShoppingRepository shoppingrepository;

	@Override
	public ShoppingDto create(ShoppingDto shoppingdto) {
		Shopping result = convertDtoToEntity(shoppingdto);
		Shopping resposne = shoppingrepository.save(result);
		ShoppingDto result1 = convertEntityToDto(resposne);
		return result1;
	}

	private ShoppingDto convertEntityToDto(Shopping resposne) {
		ShoppingDto shoppingdto = new ShoppingDto();
		shoppingdto.setShoppingId(resposne.getShoppingId());
		shoppingdto.setShoppingName(resposne.getShoppingName());
		return shoppingdto;
	}

	private Shopping convertDtoToEntity(ShoppingDto shoppingdto) {
		Shopping shopping = new Shopping();
		shopping.setShoppingId(shoppingdto.getShoppingId());
		shopping.setShoppingName(shoppingdto.getShoppingName());
		return shopping;
	}

	@Override
	public ShoppingDto update(ShoppingDto shoppingdto) {
		Shopping result = convertDtoToEntity(shoppingdto);
		Shopping resposne = shoppingrepository.save(result);
		ShoppingDto result1 = convertEntityToDto(resposne);
		return result1;
	}

	@Override
	public Boolean deleteById(Integer shoppingId) {
	   shoppingrepository.deleteById(shoppingId);
		return true;
	}

}
