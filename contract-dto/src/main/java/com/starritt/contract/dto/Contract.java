package com.starritt.contract.dto;

public class Contract {
	
	private String name;
	
	private int contractNumber;
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contract [name=").append(name).append(", contractNumber=").append(contractNumber).append("]");
		return builder.toString();
	}


	public String getName() {
		return name;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getContractNumber() {
		return contractNumber;
	}
	
	public void setContractNumber(int contractNumber){
		this.contractNumber = contractNumber;
	}

}
