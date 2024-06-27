package com.project.simple.first.service;

import com.project.simple.first.model.CustomerModel;

import java.util.UUID;

public interface CustomerService {

    CustomerModel getCustomerById(UUID customerId);

    CustomerModel saveNewCustomer(CustomerModel customerModel);
}
