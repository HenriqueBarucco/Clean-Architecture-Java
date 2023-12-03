package com.henriquebarucco.cleanarch.core.dataprovider;

import com.henriquebarucco.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
