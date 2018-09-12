package br.com.groupsoftware.domain.dto;

import java.util.List;

public class TownHouseDTO {

	private Long id;
	private List<UnitDTO> unites;
	private AddressDTO address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<UnitDTO> getUnites() {
		return unites;
	}

	public void setUnites(List<UnitDTO> unites) {
		this.unites = unites;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

}
