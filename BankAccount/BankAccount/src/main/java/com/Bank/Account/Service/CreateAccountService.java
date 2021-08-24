package com.Bank.Account.Service;

import com.Bank.Account.model.BankAccount;

//import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreateAccountService {

	public Mono<BankAccount> loginAccount(long id);
	public Mono<BankAccount> createAccount(BankAccount account);


}
