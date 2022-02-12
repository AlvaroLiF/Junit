package es.iessoterohernadez.daw.endes.BoletinJunit;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.*;
import org.hamcrest.CoreMatchers;
import org.hamcrest.*;

public class TestSubscripcion extends CoreMatchers{
	
	private static Subscripcion sub;
	
	@BeforeAll
	public static void iniciar() {
		sub = new Subscripcion(108,12);
	}
	
	@AfterAll
	public static void anular() {
		sub = null;
	}

	@Test
	public void TestConstructor() {
		assertThat(sub, notNullValue());
	}

	@Test
	public void TestPrecioPormes() {
		sub=new Subscripcion(-20,0);
		assertEquals(sub.precioPorMes(),0);
	}
	
	@Test 
	public void TestPrecioPorMes2() {
		sub=new Subscripcion(100,10);
		assertEquals(sub.precioPorMes(), 10);
	}
	
	@Test
	public void TestPrecioPorMes3() {
		sub=new Subscripcion(30,4);
		assertEquals(sub.precioPorMes(),7,5);
	}
	@Test 
	public void TestPrecioPorMes4() {
		sub=new Subscripcion(100,-10);
		assertEquals(sub.precioPorMes(), 0);
	}
	
	
	@Test 
	public void TestPrecioPorMes5() {
		sub=new Subscripcion(-100,-10);
		assertEquals(sub.precioPorMes(), 0);
	}
	
	@Test 
	public void TestPrecioPorMes6() {
		sub=new Subscripcion(0,-10);
		assertEquals(sub.precioPorMes(), 0);
	}
	
	@Test 
	public void TestPrecioPorMes7() {
		sub=new Subscripcion(-100,10);
		assertEquals(sub.precioPorMes(), 0);
	}
	
	@Test
	public void TestCancel() {
		sub=new Subscripcion(100,10);
		sub.cancel();
		assertEquals(sub.precioPorMes(),0);
	}
}
