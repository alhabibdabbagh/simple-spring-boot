package com.project.simple.first.service.impl;

import com.project.simple.first.model.CustomerModel;
import com.project.simple.first.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
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
    public CustomerModel saveNewCustomer( CustomerModel customerModel) {
    return CustomerModel.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerModel customerModel) {
        //TODO control the id if exit
        //TODO and update the customer
        log.debug("updating customer");

    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //TODO same control
        log.debug("deleting customer");
    }
}
