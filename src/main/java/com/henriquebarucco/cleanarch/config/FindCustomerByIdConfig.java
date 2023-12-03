package com.henriquebarucco.cleanarch.config;

import com.henriquebarucco.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.henriquebarucco.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
