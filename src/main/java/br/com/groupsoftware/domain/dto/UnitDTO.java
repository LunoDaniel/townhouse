package br.com.groupsoftware.domain.dto;

import br.com.groupsoftware.domain.TownHouse;

public class UnitDTO {

	private Long id;
	private ResidentDTO resident;

	private TownHouse townHouse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ResidentDTO getResident() {
		return resident;
	}

	public void setResident(ResidentDTO resident) {
		this.resident = resident;
	}

	public TownHouse getTownHouse() {
		return townHouse;
	}

	public void setTownHouse(TownHouse townHouse) {
		this.townHouse = townHouse;
	}

}
