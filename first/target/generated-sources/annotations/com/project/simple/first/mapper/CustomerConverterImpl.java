package com.project.simple.first.mapper;

import com.project.simple.first.model.CustomerDTOModel;
import com.project.simple.first.model.CustomerDTOModel.CustomerDTOModelBuilder;
import com.project.simple.first.model.CustomerModel;
import com.project.simple.first.model.CustomerModel.CustomerModelBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-08T13:30:22+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class CustomerConverterImpl implements CustomerConverter {

    @Override
    public CustomerModel customerDTOToCustomer(CustomerDTOModel customerDTOModel) {
        if ( customerDTOModel == null ) {
            return null;
        }

        CustomerModelBuilder customerModel = CustomerModel.builder();

        customerModel.id( customerDTOModel.getId() );
        customerModel.name( customerDTOModel.getName() );

        return customerModel.build();
    }

    @Override
    public CustomerDTOModel customerToCustomerDTO(CustomerModel customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTOModelBuilder customerDTOModel = CustomerDTOModel.builder();

        customerDTOModel.id( customer.getId() );
        customerDTOModel.name( customer.getName() );

        return customerDTOModel.build();
    }
}
