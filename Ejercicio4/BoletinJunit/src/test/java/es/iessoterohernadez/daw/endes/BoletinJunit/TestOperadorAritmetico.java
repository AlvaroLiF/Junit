package es.iessoterohernadez.daw.endes.BoletinJunit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOperadorAritmetico {

	private static OperadorAritmetico operador;
	private static NoSuchItemException excep;

	@BeforeAll
	public static void iniciar() {
		operador = new OperadorAritmetico();
		excep = new NoSuchItemException("error");
	}

	@AfterAll
	public static void anular() {

	}

	@Test
	public void TestSuma() {
		assertEquals(2, operador.suma(1, 1));
	}

	@Test
	public void TestDivision() throws Exception {
		assertEquals(2, operador.division(10, 5));
	}

	@Test
	public void suma() {
		int esperado = 8;
		int a = 5;
		int b = 3;
		int suma = OperadorAritmetico.suma(a, b);
		assertEquals(esperado, suma);
	}

	@Test
	public void divisionConCero() {
		int a = 8;
		int b = 0;
		int division;
		try {
			division = OperadorAritmetico.division(a, b);
			fail("Debería haber entrado al catch");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void division() {
		int esperado = 2;
		int a = 8;
		int b = 4;
		int division;
		try {
			division = OperadorAritmetico.division(a, b);
			assertEquals(esperado, division);
		} catch (Exception e) {
			fail();
		}
	}
}
