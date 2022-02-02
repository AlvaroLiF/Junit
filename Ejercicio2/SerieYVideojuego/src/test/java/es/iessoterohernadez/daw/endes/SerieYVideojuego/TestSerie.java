package es.iessoterohernadez.daw.endes.SerieYVideojuego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSerie {

	private Serie serie1,serie2;
	
	@BeforeEach
	public void Serie() {
		serie1=new Serie();
		serie2=new Serie();
	}
	
	@Test
	void TestToString() {
		serie1.setTitulo("Titulo");
		serie1.setGenero("Ficcion");
		serie1.setcreador("Nadal");
		serie1.setnumeroTemporadas(7);
		assertSame(serie1.toString(), serie1.toString());
	}
	
	@Test
	void TestCompareTo1() {
		serie1.setTitulo("Titulo");
		serie1.setGenero("Ficcion");
		serie1.setcreador("Nadal");
		serie1.setnumeroTemporadas(7);
		serie2.setTitulo("Title");
		serie2.setGenero("Fiction");
		serie2.setcreador("Yokovid");
		serie2.setnumeroTemporadas(5);
		assertEquals(1, serie1.compareTo(serie2));
	}
	
	@Test
	void TestCompareTo2() {
		serie1.setTitulo("Titulo");
		serie1.setGenero("Ficcion");
		serie1.setcreador("Nadal");
		serie1.setnumeroTemporadas(3);
		serie2.setTitulo("Title");
		serie2.setGenero("Fiction");
		serie2.setcreador("Yokovid");
		serie2.setnumeroTemporadas(5);
		assertEquals(-1, serie1.compareTo(serie2));
	}
	
	@Test
	void TestCompareTo3() {
		serie1.setTitulo("Titulo");
		serie1.setGenero("Ficcion");
		serie1.setcreador("Nadal");
		serie1.setnumeroTemporadas(5);
		serie2.setTitulo("Title");
		serie2.setGenero("Fiction");
		serie2.setcreador("Yokovid");
		serie2.setnumeroTemporadas(5);
		assertEquals(0, serie1.compareTo(serie2));
	}
	
	@Test
	void TestBoolean() {
		serie1.setTitulo("Titulo");
		serie1.setcreador("Nadal");
		serie2.setTitulo("Titulo");
		serie2.setcreador("Nadal");
		assertTrue(serie1.equals(serie2));
	}
	
	@Test
	void TestBoolean2() {
		serie1.setTitulo("Titulo");
		serie1.setcreador("Nadal");
		serie2.setTitulo("Tit");
		serie2.setcreador("Na");
		assertFalse(serie1.equals(serie2));
	}
}
