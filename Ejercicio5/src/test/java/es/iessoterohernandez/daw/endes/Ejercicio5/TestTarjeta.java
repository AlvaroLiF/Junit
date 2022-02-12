package es.iessoterohernandez.daw.endes.Ejercicio5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public abstract class TestTarjeta extends TestCase 
{
	public TestTarjeta(String sTestName)
	{
		super(sTestName);
	}
	
	public abstract Tarjeta getTarjetaObtenida();
	public abstract Tarjeta prepararTarjetaEsperada();
	
	public void testRetirar1000() 
	{
		try 
		{
			Tarjeta obtenida=getTarjetaObtenida();
			obtenida.retirar(1000.0);
			
			Tarjeta esperada=prepararTarjetaEsperada();
			assertEquals(obtenida.getSaldo(), esperada.getSaldo(), 0.0);
		}
		catch (Exception e) 
		{
			
		}
	}
}