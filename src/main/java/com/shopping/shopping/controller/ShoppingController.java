package com.shopping.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.shopping.dto.ShoppingDto;
import com.shopping.shopping.service.ShoppingService;

@RestController
public class ShoppingController {
	@Autowired
private ShoppingService shoppingservice;
	@PostMapping("/createadd")
	public ResponseEntity<?> create (@RequestBody ShoppingDto shoppingdto){
		ShoppingDto response = shoppingservice.create(shoppingdto);
		return new ResponseEntity<ShoppingDto>(response,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<?> update (@RequestBody ShoppingDto shoppingdto){
		ShoppingDto response = shoppingservice.update(shoppingdto);
		return new ResponseEntity<ShoppingDto>(response,HttpStatus.OK);
	}
	@DeleteMapping("/delete{id}")
	public ResponseEntity<?>deleteById(@PathVariable ("id") Integer shoppingId){
		Boolean response = shoppingservice.deleteById(shoppingId);
		return new ResponseEntity<Boolean>(response,HttpStatus.OK);
	}
	
}
