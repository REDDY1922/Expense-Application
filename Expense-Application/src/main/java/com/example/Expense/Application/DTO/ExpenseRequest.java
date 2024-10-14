package com.example.Expense.Application.DTO;

import java.util.Map;

public class ExpenseRequest {
	private String description;
	private Double amount;
	private String splitMethod;
	private Map<Long,Double> splitDetails;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getSplitMethod() {
		return splitMethod;
	}
	public void setSplitMethod(String splitMethod) {
		this.splitMethod = splitMethod;
	}
	public Map<Long, Double> getSplitDetails() {
		return splitDetails;
	}
	public void setSplitDetails(Map<Long, Double> splitDetails) {
		this.splitDetails = splitDetails;
	}
	
}
