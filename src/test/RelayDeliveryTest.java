package test;

import org.junit.jupiter.api.Test;

import homeshop.Delivery;
import homeshop.RelayDelivery;

import static org.junit.jupiter.api.Assertions.*;

public class RelayDeliveryTest {

	@Test
	public void Given_FreeRelay_WhenGettigDeliveryPrice_ThenGet0e() {
		Delivery delivery = new RelayDelivery(5);
		assertEquals(0.0, delivery.getPrice(), 0.01);
	}
	
	@Test
	public void Given_LowPriceRelay_WhenGettigDeliveryPrice_ThenGet2e99() {
		Delivery delivery = new RelayDelivery(27);
		assertEquals(2.99, delivery.getPrice(), 0.01);
	}
	
	@Test
	public void Given_HighPriceRelay_WhenGettigDeliveryPrice_ThenGet4e99() {
		Delivery delivery = new RelayDelivery(51);
		assertEquals(4.99, delivery.getPrice(), 0.01);
	}
	
	
}
