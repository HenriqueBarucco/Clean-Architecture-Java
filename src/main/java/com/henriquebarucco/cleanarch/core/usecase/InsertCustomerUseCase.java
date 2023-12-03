package com.henriquebarucco.cleanarch.core.usecase;

import com.henriquebarucco.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
