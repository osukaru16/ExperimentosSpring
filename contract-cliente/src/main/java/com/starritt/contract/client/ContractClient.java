package com.starritt.contract.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

@Component
public class ContractClient {
	
	@Autowired
	private RestOperations restOperations;
	
	
	
	/*
	public Contract getContract(final int contractNumbre) {
		
	}*/

}
