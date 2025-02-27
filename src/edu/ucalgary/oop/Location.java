package edu.ucalgary.oop;

import java.util.ArrayList;

public class Location {
	private String name;
	private String address;
	private ArrayList<DisasterVictim> occupants;
	private ArrayList<Supply> supplies;

	public Location(String name, String address) {
		this.name = name;
		this.address = address;
		this.occupants = new ArrayList<>();
		this.supplies = new ArrayList<>();
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

	public ArrayList<DisasterVictim> getOccupants() {
		return new ArrayList<>(occupants);
	}

	public void setOccupants(ArrayList<DisasterVictim> occupants) {
		this.occupants = new ArrayList<>(occupants);
	}

	public void addOccupant(DisasterVictim victim) {
		this.occupants.add(victim);
	}

	public void removeOccupant(DisasterVictim victim) {
		this.occupants.remove(victim);
	}

	public ArrayList<Supply> getSupplies() {
		return new ArrayList<>(supplies);
	}

	public void setSupplies(ArrayList<Supply> supplies) {
		this.supplies = new ArrayList<>(supplies);
	}

	public void addSupply(Supply supply) {
		this.supplies.add(supply);
	}

	public void removeSupply(Supply supply) {
		this.supplies.remove(supply);
	}
}