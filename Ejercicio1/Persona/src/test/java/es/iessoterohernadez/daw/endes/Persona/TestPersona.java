package es.iessoterohernadez.daw.endes.Persona;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class TestPersona{

	private static Persona persona;
	
	@BeforeAll
    static void iniciar(){
        persona = new Persona();
    }
	
	@AfterAll
	static void anular() {
		persona = null;
	}
	
	@Test
	void TestPesoIdeal() {
		persona.setPeso(80);
		persona.setAltura(1.80);
		assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());
	}
	
	@Test
	void TestInfrapeso() {
		persona.setPeso(10);
		persona.setAltura(1.90);
		assertEquals(Persona.INFRAPESO, persona.calcularIMC());
	}
	
	@Test
	void TestSobrepeso() {
		persona.setPeso(200);
		persona.setAltura(1.50);
		assertEquals(Persona.SOBREPESO, persona.calcularIMC());
	}
	
	@Test
	void TestMenorDeEdad() {
		persona.setEdad(12);
		assertFalse(persona.esMayorDeEdad());
	}
	
	@Test
	void TestMayorDeEdad() {
		persona.setEdad(20);
		assertTrue(persona.esMayorDeEdad());
	}
	


}
