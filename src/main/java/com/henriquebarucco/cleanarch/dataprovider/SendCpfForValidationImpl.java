package com.henriquebarucco.cleanarch.dataprovider;

import com.henriquebarucco.cleanarch.core.dataprovider.SendCpfForValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfForValidationImpl implements SendCpfForValidation {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(final String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
