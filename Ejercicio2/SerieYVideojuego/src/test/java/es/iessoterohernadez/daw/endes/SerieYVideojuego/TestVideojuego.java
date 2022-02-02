package es.iessoterohernadez.daw.endes.SerieYVideojuego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVideojuego {

	private Videojuego videojuego1,videojuego2;
	
	@BeforeEach
	public void Videojuego() {
		videojuego1=new Videojuego();
		videojuego2=new Videojuego();
		
	}
	
	@Test
	void TestToString() {
		videojuego1.setTitulo("Titulo");
		videojuego1.setGenero("Ficcion");
		videojuego1.setcompañia("Bandai");
		videojuego1.setHorasEstimadas(200);
		assertSame(videojuego1.toString(), videojuego1.toString());
	}
	
	@Test
	void TestCompareTo1() {
		videojuego1.setTitulo("Titulo");
		videojuego1.setGenero("Ficcion");
		videojuego1.setcompañia("Bandai");
		videojuego1.setHorasEstimadas(200);
		videojuego2.setTitulo("Mario");
		videojuego2.setGenero("Plataformas");
		videojuego2.setcompañia("Nintendo");
		videojuego2.setHorasEstimadas(100);
		assertEquals(1, videojuego1.compareTo(videojuego2));
	}
	
	@Test
	void TestCompareTo2() {
		videojuego1.setTitulo("Titulo");
		videojuego1.setGenero("Ficcion");
		videojuego1.setcompañia("Bandai");
		videojuego1.setHorasEstimadas(50);
		videojuego2.setTitulo("Mario");
		videojuego2.setGenero("Plataformas");
		videojuego2.setcompañia("Nintendo");
		videojuego2.setHorasEstimadas(100);
		assertEquals(-1, videojuego1.compareTo(videojuego2));
	}
	
	@Test
	void TestCompareTo3() {
		videojuego1.setTitulo("Titulo");
		videojuego1.setGenero("Ficcion");
		videojuego1.setcompañia("Bandai");
		videojuego1.setHorasEstimadas(100);
		videojuego2.setTitulo("Mario");
		videojuego2.setGenero("Plataformas");
		videojuego2.setcompañia("Nintendo");
		videojuego2.setHorasEstimadas(100);
		assertEquals(0, videojuego1.compareTo(videojuego2));
	}
	
	@Test
	void TestBoolean() {
		videojuego1.setTitulo("Titulo");
		videojuego1.setGenero("Ficcion");
		videojuego2.setTitulo("Titulo");
		videojuego2.setGenero("Ficcion");
		assertTrue(videojuego1.equals(videojuego2));
	}
	
	@Test
	void TestBoolean2() {
		videojuego1.setTitulo("Titulo");
		videojuego1.setGenero("Ficcion");
		videojuego2.setTitulo("Mario");
		videojuego2.setGenero("Plataformas");
		assertFalse(videojuego1.equals(videojuego2));
	}
}
