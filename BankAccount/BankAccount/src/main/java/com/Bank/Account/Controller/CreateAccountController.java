package com.Bank.Account.Controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.Bank.Account.Service.CreateAccountServiceImpl;
import com.Bank.Account.model.BankAccount;
import com.Bank.Account.model.ResponseMessage;

//import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/home")
public class CreateAccountController {
	@Autowired
	CreateAccountServiceImpl AccService;

	@GetMapping("/login/{id}")
	public Mono<BankAccount> loginAccount(@PathVariable long id) {
		return AccService.loginAccount(id);
	}

	// post the customer details into database
	@PostMapping("/createAccount")
	public Mono<ResponseEntity<ResponseMessage>> createAccount(@RequestBody BankAccount account)
			throws URISyntaxException {
		Mono<BankAccount> acc = AccService.createAccount(account);

		StringBuilder locationStr = new StringBuilder();
		acc.subscribe(e -> locationStr.append("http://loaclhost:8080/createAccount/").append(e.getCustomerId()));

		URI location = new URI(locationStr.toString());
		return Mono.just(
				ResponseEntity.created(location).body(this.getResponse(account.getCustomerId(), "Account Created")));
	}

	// get an id and message and return the value
	public ResponseMessage getResponse(String string, String message) {
		ResponseMessage response = new ResponseMessage();
		response.setId(string);
		response.setStatus(HttpStatus.OK.name());
		response.setStatusCode(HttpStatus.OK.value());
		response.setMessage(message);
		return response;

	}
}
