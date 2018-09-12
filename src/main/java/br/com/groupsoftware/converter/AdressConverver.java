package br.com.groupsoftware.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.groupsoftware.domain.Address;
import br.com.groupsoftware.domain.dto.AddressDTO;

@Component
public class AdressConverver implements Converter<AddressDTO, Address> {


	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Address convert(AddressDTO source) {
		return modelMapper.map(source, Address.class);
	}
	
	public AddressDTO convertToDTO(Address source) {
		return modelMapper.map(source, AddressDTO.class);
	}

}
