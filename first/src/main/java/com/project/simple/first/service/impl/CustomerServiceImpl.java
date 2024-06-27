package com.project.simple.first.service.impl;

import com.project.simple.first.model.CustomerModel;
import com.project.simple.first.service.CustomerService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerModel getCustomerById(UUID customerId) {
        return CustomerModel.builder()
                .id(UUID.randomUUID())
                .name("Habib")
                .build();
    }

    @Override
    public CustomerModel saveNewCustomer(@NotNull CustomerModel customerModel) {
    return CustomerModel.builder()
            .id(UUID.randomUUID())
            .build();
    }
}
