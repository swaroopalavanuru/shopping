package com.shopping.shopping.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.shopping.dto.MarketDto;
import com.shopping.shopping.service.MarketService;

@RestController
public class MarketController {
	@Autowired
	private MarketService marketservice;
    @PostMapping("/createvalues")
    public ResponseEntity<?> createValues (@RequestBody MarketDto marketdto){
    	Object response = marketservice.create(marketdto);
    	return new ResponseEntity<Object>(response,HttpStatus.OK);
    	
    }
    @PutMapping("/updatevalues")
    public ResponseEntity<?> updateValues (@RequestBody MarketDto marketdto){
    	Object response = marketservice.update(marketdto);
    	return new ResponseEntity<Object>(response,HttpStatus.OK);
    }
    
}
