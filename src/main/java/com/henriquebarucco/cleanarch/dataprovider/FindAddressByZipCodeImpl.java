package com.henriquebarucco.cleanarch.dataprovider;

import com.henriquebarucco.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.henriquebarucco.cleanarch.core.domain.Address;
import com.henriquebarucco.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.henriquebarucco.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
