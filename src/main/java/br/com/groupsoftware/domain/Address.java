package br.com.groupsoftware.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;
	private Integer number;
	private String neighborhood;
	
	@SuppressWarnings("unused")
	private Address() {
		
	}

	public Address(String street, Integer number, String neighborhood) {
		super();
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

}
