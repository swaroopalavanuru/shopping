package com.shopping.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.shopping.model.Market;

@Repository
public interface MarketRepository extends JpaRepository<Market,Integer>{

}
