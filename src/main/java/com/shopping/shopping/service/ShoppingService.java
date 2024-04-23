package com.shopping.shopping.service;

import com.shopping.shopping.dto.ShoppingDto;

public interface ShoppingService {

	ShoppingDto create(ShoppingDto shoppingdto);

	ShoppingDto update(ShoppingDto shoppingdto);

	Boolean deleteById(Integer shoppingId);



}
