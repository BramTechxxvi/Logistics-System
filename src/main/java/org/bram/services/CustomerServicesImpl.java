package org.bram.services;

import org.bram.data.repositories.CustomerRepository;
import org.bram.dtos.request.CustomerRegisterRequest;
import org.bram.dtos.request.LoginRequest;
import org.bram.dtos.response.CustomerRegisterResponse;
import org.bram.dtos.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServicesImpl implements CustomerServices{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServicesImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerRegisterResponse registerCustomer(CustomerRegisterRequest request) {
        return null;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
    }
}
