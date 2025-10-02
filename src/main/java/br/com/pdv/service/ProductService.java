package br.com.pdv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.pdv.dto.ProductDTO;
import br.com.pdv.model.ProductModel;
import br.com.pdv.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	public ProductRepository productRepository;
	
	public ResponseEntity<String> registerProduct(ProductDTO dto) {
		
		ProductModel product = new ProductModel();
		product.setName(dto.getName());
		product.setAmount(dto.getAmount());
		product.setDescription(dto.getDescription());
		product.setPrice(dto.getPrice());
		
		productRepository.save(product);
		
		return ResponseEntity.ok("Produto cadastrado.");
	}
	
	public List<ProductDTO> getAllProduct() {
		return productRepository.findAll().stream().map(product -> {
			
		ProductDTO dto = new ProductDTO();
		dto.setName(product.getName());
		dto.setAmount(product.getAmount());
		dto.setDescription(product.getDescription());
		dto.setPrice(product.getPrice());
		
		return dto;
		
	}).collect(Collectors.toList());
	}
}