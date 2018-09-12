package br.com.groupsoftware.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.groupsoftware.domain.Unit;
import br.com.groupsoftware.domain.dto.UnitDTO;

@Component
public class UnitConverter implements Converter<UnitDTO, Unit> {

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Unit convert(UnitDTO source) {
		return modelMapper.map(source, Unit.class);
	}

	public UnitDTO convertToDTO(Unit source) {
		return modelMapper.map(source, UnitDTO.class);
	}
}
