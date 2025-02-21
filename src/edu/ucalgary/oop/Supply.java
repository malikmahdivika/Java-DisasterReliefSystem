package edu.ucalgary.oop;

public class Supply {
	private String type;
	private int quantity;
	
	public Supply(String type, int quantity) {
		this.setType(type);
		this.setQuantity(quantity);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
