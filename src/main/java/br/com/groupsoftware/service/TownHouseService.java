package br.com.groupsoftware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.groupsoftware.converter.TownHouseConverter;
import br.com.groupsoftware.domain.TownHouse;
import br.com.groupsoftware.domain.dto.TownHouseDTO;
import br.com.groupsoftware.repository.TownHouseRepository;

@Service
public class TownHouseService {

	@Autowired
	private TownHouseRepository townhouseRepository;

	@Autowired
	private TownHouseConverter townhouseConverter;

	public TownHouseDTO saveTownHouse(TownHouseDTO townhoseDto) {
		TownHouse savedTownHouse = townhouseRepository.save(townhouseConverter.convert(townhoseDto));
		return townhouseConverter.converToDTO(savedTownHouse);
	}
	
}
