package br.com.pdv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.pdv.dto.StockDTO;
import br.com.pdv.model.StockModel;
import br.com.pdv.repository.StockRepository;

@Service
public class StockService {

	@Autowired
	public StockRepository stockRepository;
	
	public ResponseEntity<String> stockSave(StockDTO dto) {
		
		StockModel stock = new StockModel();
		stock.setAmount(dto.getAmount());
		stock.setPurchasePrice(dto.getPurchasePrice());
		stock.setSalePrice(dto.getSalePrice());
		stock.setUnitOfMeasurement(dto.getUnitOfMeasurement());
		stock.setEntryAndExit(dto.getEntryAndExit());
		
		stockRepository.save(stock);
		
		return ResponseEntity.ok("Cadastrado no estoque.");
	}
	
	public List<StockDTO> getAllStock() {
		return stockRepository.findAll().stream().map(stock -> {
			
			StockDTO dto = new StockDTO();
			dto.setAmount(stock.getAmount());
			dto.setPurchasePrice(stock.getPurchasePrice());
			dto.setSalePrice(stock.getSalePrice());
			dto.setUnitOfMeasurement(stock.getUnitOfMeasurement());
			dto.setEntryAndExit(stock.getEntryAndExit());
			
			return dto;
			
		}).collect(Collectors.toList());
	}
}