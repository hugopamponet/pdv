package br.com.pdv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_stock")
public class StockModel {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	private Long amount;
	private String purchasePrice;
	private String salePrice;
	private String unitOfMeasurement;
	private String entryAndExit;
	
	public StockModel() {
		
	}

	public StockModel(String id, Long amount, String purchasePrice, String salePrice, String unitOfMeasurement,
			String entryAndExit) {
		this.id = id;
		this.amount = amount;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		this.unitOfMeasurement = unitOfMeasurement;
		this.entryAndExit = entryAndExit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public String getEntryAndExit() {
		return entryAndExit;
	}

	public void setEntryAndExit(String entryAndExit) {
		this.entryAndExit = entryAndExit;
	}
}