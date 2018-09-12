package br.com.groupsoftware.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.groupsoftware.domain.Resident;
import br.com.groupsoftware.domain.dto.ResidentDTO;

@Component
public class ResidentConverter implements Converter<ResidentDTO, Resident> {

	

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Resident convert(ResidentDTO source) {
		return modelMapper.map(source, Resident.class);
	}
	
	public ResidentDTO convertToDTO(Resident source) {
		return modelMapper.map(source, ResidentDTO.class);
	}
}
