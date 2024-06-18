package com.capgemini.capbank.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.AccountApi;
import com.capgemini.CustomerApi;
import com.capgemini.model.Account;
import com.capgemini.model.AccountCreated;
import com.capgemini.model.Customer;


@RestController
@RequestMapping("/api/capbank/v1/account")
public class AccountController implements AccountApi{

	
	@Override
	@GetMapping("/getAccountInfoAndBalance/{accountId}")
	public ResponseEntity<Account> getAccountDtlsById(Integer accountId) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Account>(HttpStatus.ACCEPTED);
	}

	@Override
	@PostMapping("/saveAccntWithCrdtOrNoCrdt")
	public ResponseEntity<AccountCreated> addCustomer(@Valid Account body) {
		// TODO Auto-generated method stub
		return new ResponseEntity<AccountCreated>(HttpStatus.ACCEPTED);
	}

	

}
