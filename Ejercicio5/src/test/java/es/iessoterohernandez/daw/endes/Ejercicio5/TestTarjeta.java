package es.iessoterohernandez.daw.endes.Ejercicio5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class TestTarjeta
{
	
	public abstract Tarjeta getTarjetaObtenida();
	public abstract Tarjeta prepararTarjetaEsperada();
	
	@Test
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