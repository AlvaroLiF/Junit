package es.iessoterohernadez.daw.endes.ShoppingCart;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestShoppingCart {
	
	private static ShoppingCart carro;
	private static Product producto;
	
	@BeforeAll
	static void Iniciar() {
		carro = new ShoppingCart();
		producto = new Product("Chocolate",1.29);
	}
	
	@AfterAll
	static void Anular() {
		carro = null;
	}
	
	@Test
	public void TestCrearCarro() {
		assertEquals(0,carro.getItemCount());
	}

	@Test
	public void TestCarroVacio() {
		carro.addItem(producto);
		carro.empty();
		assertEquals(0,carro.getItemCount());
	}
	
	@Test
	public void TestAñadirProducto() {
		carro.addItem(producto);
		assertEquals(1,carro.getItemCount());
	}
	
	@Test
	public void TestBalance() {
		carro.addItem(producto);
		assertEquals(1.29,carro.getBalance());
	}
	
	@Test
	public void TestEliminarProducto() throws ProductNotFoundException {
		carro.addItem(producto);
		carro.removeItem(producto);
		assertEquals(0,carro.getItemCount());
	}
	
	
	@Test
	public void TestEliminarProductoFueraDelCarro() {
		carro.addItem(producto);
		try {
			carro.removeItem(producto);
		} catch (ProductNotFoundException e) {
			fail();
		}
		assertEquals(0, carro.getItemCount());
	}
}
