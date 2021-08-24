//package com.Bank.Account.Controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.client.MockMvcWebTestClient;
//
//import com.Bank.Account.Service.CreateAccountServiceImpl;
//import com.Bank.Account.model.BankAccount;
//
//import reactor.core.publisher.Mono;
//
//
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class CreateAccountController {
//	
//	@Autowired
//	MockMvcWebTestClient webTestclient;
//	
//	@MockBean
//	CreateAccountServiceImpl testService;
//	
//	@Test
//	public void createAccount() {
//		BankAccount bankAccount = new BankAccount("1","1", "sarvan", "sarvan@123", "password@123", "chennai", "tamilnadu", "india", "sarvan@example.com", "ABCD1234LM", "1234567890", "25-08-21", "savings");
//		
//		Mockito.when(testService.createAccount(bankAccount)).thenReturn(Mono.just(bankAccount));
//		webTestclient
//			
//	}
//
//}
