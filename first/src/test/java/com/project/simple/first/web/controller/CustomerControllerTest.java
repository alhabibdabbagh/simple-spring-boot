package com.project.simple.first.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.simple.first.model.CustomerModel;
import com.project.simple.first.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

import static org.awaitility.Awaitility.given;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    CustomerService customerService;


    @Test
    public void getCustomer() throws Exception{

mockMvc.perform(get("/api/v1/customer"+UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON));

    }
    @Test
    void saveCustomer() throws Exception{
        CustomerModel customerModel=CustomerModel.builder().build();
        customerModel.setId(UUID.randomUUID());
        customerModel.setName("habib from test");
        String customerDtoJson = objectMapper.writeValueAsString(customerModel);
        mockMvc.perform(post("/api/v1/customer")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(customerDtoJson))
                .andExpect(status().isCreated());

    }

    @Test
    void updateCustomer() throws Exception{
        CustomerModel customerModel=CustomerModel.builder().build();
        customerModel.setId(UUID.randomUUID());
        customerModel.setName("habib from test");
        String customerDtoJson = objectMapper.writeValueAsString(customerModel);
        mockMvc.perform(put("/api/v1/customer"+UUID.randomUUID().toString())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(customerDtoJson))
                .andExpect(status().isNoContent());

    }

}
