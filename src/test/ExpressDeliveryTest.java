package test;

import org.junit.jupiter.api.Test;

import homeshop.Delivery;
import homeshop.ExpressDelivery;
import static org.junit.jupiter.api.Assertions.*;

public class ExpressDeliveryTest {

	@Test
	public void Given_RegionCityAsLocation_WhenGettingDeliveryPrice_ThenGet9e99() {
		Delivery delivery = new ExpressDelivery("Lyon");
		assertEquals(9.99, delivery.getPrice(), 0.01);
	}
	
	@Test
	public void Given_RegionCityAsLocation_WhenGettingDeliveryPrice_ThenGet6e99() {
		Delivery delivery = new ExpressDelivery("Paris");
		assertEquals(6.99, delivery.getPrice(), 0.01);
	}
	
}
