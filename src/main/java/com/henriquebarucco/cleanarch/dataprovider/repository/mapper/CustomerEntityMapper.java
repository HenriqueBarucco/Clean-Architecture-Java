package com.henriquebarucco.cleanarch.dataprovider.repository.mapper;

import com.henriquebarucco.cleanarch.core.domain.Customer;
import com.henriquebarucco.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
