package com.project.simple.first.mapper;

import com.project.simple.first.model.CustomerDTOModel;
import com.project.simple.first.model.CustomerModel;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerConverter {
    CustomerModel customerDTOToCustomer(CustomerDTOModel customerDTOModel);
    CustomerDTOModel customerToCustomerDTO(CustomerModel customer);
}