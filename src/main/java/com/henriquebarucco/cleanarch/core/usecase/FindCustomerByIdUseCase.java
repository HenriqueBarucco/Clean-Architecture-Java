package com.henriquebarucco.cleanarch.core.usecase;

import com.henriquebarucco.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
