package br.com.groupsoftware;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.groupsoftware.domain.dto.AddressDTO;
import br.com.groupsoftware.domain.dto.ResidentDTO;
import br.com.groupsoftware.domain.dto.TownHouseDTO;
import br.com.groupsoftware.domain.dto.UnitDTO;
import br.com.groupsoftware.service.TownHouseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TownhouseApplicationTests {

	@Autowired
	private TownHouseService service;

	@Test
	public void townHouse_Test() {
		
		AddressDTO address = new AddressDTO();
		ResidentDTO resident = new ResidentDTO();
		UnitDTO unit = new UnitDTO();
		List<UnitDTO> unites = new ArrayList<>();
		
		address.setNeighborhood("Achieta");
		address.setNumber(320);
		address.setStreet("Penafiel");
		
		resident.setLastName("Batista");
		resident.setName("Luno");
		
		unit.setResident(resident);
		
		unites.add(unit);
		
		TownHouseDTO townHouse = new TownHouseDTO();
		
		townHouse.setAddress(address);
		townHouse.setUnites(unites);
		
		townHouse = service.saveTownHouse(townHouse);
		
		System.out.println(townHouse);
		
	}

}
