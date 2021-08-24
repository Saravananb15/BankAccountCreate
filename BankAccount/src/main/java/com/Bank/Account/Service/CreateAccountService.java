package com.Bank.Account.Service;

import com.Bank.Account.model.BankAccount;

//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreateAccountService {
//	public Flux<BankAccount> getAccount();
//	public Mono<BankAccount> getAccount(long id);
	public Mono<BankAccount> createAccount(BankAccount account);


}
