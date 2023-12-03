package com.henriquebarucco.cleanarch.dataprovider.client.mapper;

import com.henriquebarucco.cleanarch.core.domain.Address;
import com.henriquebarucco.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
