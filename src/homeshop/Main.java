package homeshop;

public class Main {

	public static void main(String[] args) {
		
		Product cafe = new Product("Philips HD", "Philips SENSEO Noir-1 ou 2 tasses", 79.99);
		Television tv = new Television("TV Samsung", "Smart TV LED", 599, 49, "LED");
		Fridge fridge = new Fridge("BEKO TSE", "Réfrigirateur BEKO 130L blanc", 189, 130, false);
		
		Customer customer = new Customer("Jean Dupond", "2 rue de la république, Paris");
		
		Bill bill = new Bill(customer, new RelayDelivery(27));
		
		bill.addProduct(cafe, 1);
		bill.addProduct(tv, 1);
		bill.addProduct(fridge, 1);
		
		bill.generate(new FileWriter("facture Dupond"));
		
	}

}
