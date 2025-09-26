package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pdv.model.StockModel;

public interface StockRepository extends JpaRepository<StockModel, String>{

}
