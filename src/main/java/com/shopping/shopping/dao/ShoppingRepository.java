package com.shopping.shopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.shopping.model.Shopping;

@Repository
public interface ShoppingRepository  extends JpaRepository<Shopping,Integer>{

}
