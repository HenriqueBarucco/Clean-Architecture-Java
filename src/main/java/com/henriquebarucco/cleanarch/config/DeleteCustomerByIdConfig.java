package com.henriquebarucco.cleanarch.config;

import com.henriquebarucco.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.henriquebarucco.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.henriquebarucco.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
