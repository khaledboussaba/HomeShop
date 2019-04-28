package homeshop;

public class Fridge extends Product{

	private int liter;
	private boolean freezer;
	
	public Fridge(String name, String description, double price, int liter, boolean freeze) {
		super(name, description, price);
		this.liter = liter;
		this.freezer = freeze;
	}

	public boolean isFreezer() {
		return freezer;
	}

	public int getLiter() {
		return liter;
	}

	
	
}