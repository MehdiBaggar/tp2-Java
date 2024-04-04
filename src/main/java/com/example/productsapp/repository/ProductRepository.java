package com.example.productsapp.repository;

import com.example.productsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long>{
    List<Product> findByNameContains(String mc);
    List<Product> findByPriceGreaterThan(double price);

   @Query("select p from Product p where p.name like :x ")
    List<Product> search(@Param("x") String mc);
}
