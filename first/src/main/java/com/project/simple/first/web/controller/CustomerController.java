package com.project.simple.first.web.controller;

import com.project.simple.first.model.CustomerModel;
import com.project.simple.first.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerModel> getCustomer(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);


    }
    @PutMapping({"/{customerId}"})
    public ResponseEntity updateCustomer( @PathVariable("customerId") UUID customerId,
                                          @RequestBody CustomerModel customerModel){
        customerService.updateCustomer(customerId,customerModel);

        return new  ResponseEntity(HttpStatus.NO_CONTENT);

    }
    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomer(customerId);
//      return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @PostMapping
    public ResponseEntity createCustomer(@RequestBody CustomerModel customerModel) {
        customerModel=customerService.saveNewCustomer(customerModel);
        HttpHeaders headers=new HttpHeaders();
        headers.set("Location","http://localhost:8080/api/v1/customer/"+customerModel);
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }

}
