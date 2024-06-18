package com.capgemini.capbank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.CustomerApi;
import com.capgemini.model.Customer;



@RestController
@RequestMapping("/api/capbank/v1/customer")
public class CustomerController implements CustomerApi{

	@GetMapping("/getCustomer/{customerId}")
	public ResponseEntity<Customer> getCustomerDtlsById(String customerId) {
		// TODO Auto-generated method stub
		Customer cus = new Customer();
		cus.setCustomerId(customerId);
		cus.setFirstName("monali");
		cus.setLastName("aich");
		return new ResponseEntity<Customer>(cus,HttpStatus.ACCEPTED);
	}

}
