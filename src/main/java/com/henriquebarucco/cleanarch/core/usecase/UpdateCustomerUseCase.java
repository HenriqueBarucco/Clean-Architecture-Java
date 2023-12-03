package com.henriquebarucco.cleanarch.core.usecase;

import com.henriquebarucco.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
