package br.com.pdv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pdv.dto.StockDTO;
import br.com.pdv.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	public StockService stockService;
	
	@PostMapping("/saveStock")
	public ResponseEntity<String> registerStock(@RequestBody StockDTO dto) {
		return stockService.stockSave(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<StockDTO>> getAllStock() {
		return ResponseEntity.ok(stockService.getAllStock());
	}
}