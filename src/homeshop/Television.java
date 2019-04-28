package homeshop;

public class Television extends Product{

	private int size;
	private String slabType;
	
	public Television(String name, String description, double price, int size, String slabType ) {
		super(name, description, price);
		this.size = size;
		this.slabType = slabType;
	}

	public String getSlabType() {
		return slabType;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
