package com.example.InsuranceContract;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class InsuranceContractApplicationTests {
		InsuranceContractResource icr = new InsuranceContractResource();

	@Test
	void sendingLegalContractNameShouldReturnSuccess() {

		assertEquals(icr.createContract("Inbo", "Sofia"), "Contract 98765 Sent");
	}

	@Test
	void sendingIllegalContractNameShouldReturnFail(){
		assertEquals(icr.createContract("Ingen", "Sofia"), "Contract 98765 not sent. Invalid name");
	}

}
