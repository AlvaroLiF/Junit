package es.iessoterohernadez.daw.endes.BoletinJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestPila {
	private static Pila pila;
	
	@BeforeAll
	public static void iniciar() {
		pila= new Pila();
	}

	@AfterAll
	public static void anular() {
		pila=null;
	}
	
	@Test
	public void TestPush() {
		pila.push(10);
		assertEquals(pila.pop(),10);
	}
	
	@Test
	public void TestPush2(){
		pila= new Pila();
		pila.push(0);
		assertEquals(pila.pop(),null);
	}
	
	@Test
	public void TestPush3(){
		pila.push(1);
		pila.push(30);
		assertEquals(pila.pop(),null);
	}
	
	@Test
	public void TestBoolean() {
		pila.push(1);
		assertTrue(pila.isEmpty()==true);
	}
	
	@Test
	public void TestTop() {
		pila.push(1);
		pila.push(30);
		pila.push(20);
		pila.push(12);
		assertEquals(pila.top(),12);
	}
	
	@Test
	public void TestTop2() {
		pila.push(30);
		assertEquals(pila.top(),null);
	}
	
	
}
