package es.iessoterohernadez.daw.endes.BoletinJunit;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestAccount {
	
	private Account acc;
	
	@BeforeAll
	public void iniciar() {
		acc = new Account("Pepe",21345,232);
	}
	@AfterAll
	public void anular() {
		acc = null;
	}

	@Test
	public void TestDeposit() {
		assertFalse(acc.deposit(-10));
	}
}
