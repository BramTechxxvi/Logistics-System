package org.bram.services;

import org.bram.data.repositories.CustomerRepository;
import org.bram.dtos.request.CustomerRegisterRequest;
import org.bram.dtos.response.CustomerRegisterResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServicesImplTest {

    @Autowired
    private CustomerServices customerServices;
    @Autowired
    private CustomerRepository customerRepository;
    private CustomerRegisterRequest registerRequest;
    private CustomerRegisterResponse registerResponse;

    @BeforeEach
    void setUp() {
        customerRepository.deleteAll();
        registerRequest = new CustomerRegisterRequest();
        registerResponse = new CustomerRegisterResponse();
    }

    @Test
    public void krmgleg() {}

    private void registerCustomer() {

    }

}