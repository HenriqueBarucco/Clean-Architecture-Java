package com.henriquebarucco.cleanarch.config;

import com.henriquebarucco.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.henriquebarucco.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.henriquebarucco.cleanarch.dataprovider.InsertCustomerImpl;
import com.henriquebarucco.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
