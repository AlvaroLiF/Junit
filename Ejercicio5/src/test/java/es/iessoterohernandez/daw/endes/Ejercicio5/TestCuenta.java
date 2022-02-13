package es.iessoterohernandez.daw.endes.Ejercicio5;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCuenta
{
	Cuenta cuenta;

	@BeforeAll
	public void setUp() throws Exception
	{
		cuenta = new Cuenta("0001.0002.12.1234567890", "Fulano de Tal");
	}

	@AfterAll
	public void tearDown() throws Exception
	{
	}
	
	@Test
	public void testIngresar1000() 
	{
		try {
			cuenta.ingresar(1000);
			assertTrue(cuenta.getSaldo()==1000.0);
		}
		catch (Exception e) 
		{
			fail("No deber�a haber fallado");
		}
	}
	
	@Test
	public void testRetirar1000() 
	{
		try 
		{
			cuenta.retirar(1000);
		}
		catch (Exception e) 
		{
		}
		assertTrue(cuenta.getSaldo()==0.0);
	}
	
	@Test
	public void testIngresoYRetirada() 
	{
		try 
		{
			cuenta.ingresar(1000.0);
			cuenta.retirar(300.0);
		}
		catch (Exception e) 
		{
		}
		
		assertTrue(cuenta.getSaldo()==700.0);
	}
	
}
