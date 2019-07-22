package com.tamirspiegler.openlegacytest.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamirspiegler.openlegacytest.entities.Product;

public interface ProductJPARepository extends JpaRepository<Product, Integer>{

}
