package es.iessoterohernadez.daw.endes.BoletinJunit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestFridge extends CoreMatchers{
	
	private Fridge fridge;
	private Collection<String> food = new HashSet<String>();
	
	@BeforeAll
	public void iniciar() {
		fridge = new Fridge();
	}
	
	@AfterAll
	public void anular() {
		fridge = null;
	}
	
	
	@Parameters
	public static Collection<String[]> food(){
		String[][] food = new String[][] {{"Pollo"},{"Sandía"},{"Puerro"},{"Agua"}};
		return Arrays.asList(food);
	}
	
	@ParameterizedTest
	@MethodSource("food")
	public void TestPut(String food) {
		fridge.put(food);
		assertFalse(food.isEmpty()==true);
	}

	@ParameterizedTest
	@MethodSource("food")
	public void TestConstains(String food) {
		fridge.contains(food);
		assertTrue(food.contains(food));
	}
	
	@ParameterizedTest
	@MethodSource("food")
	public void TestTake(String food) throws NoSuchItemException {
		fridge.take(food);
		assertTrue(food.contains(food));
		assertFalse(food.contains(food));
	}
}
