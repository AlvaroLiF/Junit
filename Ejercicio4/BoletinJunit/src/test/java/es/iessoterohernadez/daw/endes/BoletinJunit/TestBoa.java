package es.iessoterohernadez.daw.endes.BoletinJunit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestBoa extends CoreMatchers{
	
	private Boa boa;
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {{"Pepa",6,"Ratones"},{"Francisco",8,"granola bars"},{"Solid Snake",11,"Aventuras"},{"Cassiopeia",15,"Blue buffs"}};
		return Arrays.asList(data);
	}

	@ParameterizedTest
	@MethodSource("data")
	public void TestConstructorBoa(String name, int lenght,String favoriteFood) {
		boa = new Boa(name,lenght,favoriteFood);
		
		assertThat(boa,notNullValue());
	}

	@ParameterizedTest
	@MethodSource("data")
	public void TestIsHealthy(String name, int lenght,String favoriteFood) {
		
		boa = new Boa(name,lenght,favoriteFood);
		
		assertTrue(boa.isHealthy());
	}
	
	@ParameterizedTest
	@MethodSource("data")
	public void TestFitsInCage(String name, int lenght,String favoriteFood) {
		
		boa = new Boa(name,lenght,favoriteFood);
		
		assertFalse(boa.fitsInCage(5));
		assertTrue(boa.fitsInCage(20));
		
	}
}
