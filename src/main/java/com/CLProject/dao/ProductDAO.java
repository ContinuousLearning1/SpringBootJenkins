package com.CLProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CLProject.entity.Products;

@Repository
public interface ProductDAO extends JpaRepository<Products, Long>{

}
