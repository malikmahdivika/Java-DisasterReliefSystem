package edu.ucalgary.oop;

public class Location {
	private String name;
	private String address;
	private DisasterVictim[] occupants;
	private Supply[] supplies;
	
	public Location(String name, String address) {
		this.setName(name);
		this.setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
