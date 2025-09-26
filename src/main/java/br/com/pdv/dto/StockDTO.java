package br.com.pdv.dto;

public class StockDTO {

	private Long amount;
	private String purchasePrice;
	private String salePrice;
	private String unitOfMeasurement;
	private String entryAndExit;
	
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