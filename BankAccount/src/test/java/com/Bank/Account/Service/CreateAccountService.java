//package com.Bank.Account.Service;
//
//import org.junit.jupiter.api.Test;
//
//import com.Bank.Account.model.BankAccount;
//
//import reactor.test.StepVerifier;
//
//public class CreateAccountService {
//	CreateAccountServiceImpl AccService;
//	
//	@Test
//	public void createAccount() {
//		BankAccount acc = new BankAccount("1","1", "sarvan", "sarvan@123", "password@123", "chennai", "tamilnadu", "india", "sarvan@example.com", "ABCD1234LM", "1234567890", "25-08-21", "savings");
//		
//		StepVerifier
//			.create(AccService.createAccount(acc))
//			.expectNext(acc)
//			.expectComplete()
//			.verify();
//	}
//
//}
