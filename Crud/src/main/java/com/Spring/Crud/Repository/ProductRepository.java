package com.Spring.Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Crud.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
