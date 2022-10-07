package com.org.SportyShoes.repository;

import com.org.SportyShoes.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
