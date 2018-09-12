package br.com.groupsoftware.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.groupsoftware.domain.TownHouse;
import br.com.groupsoftware.domain.dto.TownHouseDTO;

@Component
public class TownHouseConverter implements Converter<TownHouseDTO, TownHouse> {

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public TownHouse convert(TownHouseDTO source) {
		return modelMapper.map(source, TownHouse.class);
	}
	
	public TownHouseDTO converToDTO(TownHouse source) {
		return modelMapper.map(source, TownHouseDTO.class);
	}

}
