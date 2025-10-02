package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pdv.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, String>{

}