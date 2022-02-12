package es.iessoterohernandez.daw.endes.Ejercicio5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.Date;

public class TestDebito extends TestCase 
{
	Debito debito;
	Cuenta cuenta;

	public TestDebito(String sTestName)
	{
		super(sTestName);
	}

	public void setUp() throws Exception
	{
		cuenta=new Cuenta("0001.0002.12.1234567890", "Fulano de Tal");
		cuenta.ingresar(1000.0);
		Date hoy=new Date();
		long tiempo=Long.parseLong("12096000000");
		Date fecha=new Date(hoy.getTime()+ tiempo); // Caduca en 4 a�os
		debito=new Debito("1234567890123456", "Fulano de Tal", fecha);
		debito.setCuenta(cuenta);
	}

	public void tearDown() throws Exception
	{
	}
	
	public void testRetirar1000() 
	{
		try 
		{
			debito.retirar(1000.0);
			assertTrue(debito.getSaldo()==cuenta.getSaldo());
			assertTrue(debito.getSaldo()==0.0);
		}
		catch (Exception e) 
		{
			fail("No deberia haber fallado");
		}
	}
	
	public static void main(String args[]) 
	{
		junit.swingui.TestRunner.run(TestDebito.class);
	}
}