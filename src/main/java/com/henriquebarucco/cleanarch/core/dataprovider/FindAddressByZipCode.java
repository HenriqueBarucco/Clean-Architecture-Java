package com.henriquebarucco.cleanarch.core.dataprovider;

import com.henriquebarucco.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
