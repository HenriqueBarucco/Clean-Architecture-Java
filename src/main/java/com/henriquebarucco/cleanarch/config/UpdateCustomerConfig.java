package com.henriquebarucco.cleanarch.config;

import com.henriquebarucco.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.henriquebarucco.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.henriquebarucco.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.henriquebarucco.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
