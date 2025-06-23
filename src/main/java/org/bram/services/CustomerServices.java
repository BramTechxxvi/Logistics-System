package org.bram.services;

import org.bram.dtos.request.*;
import org.bram.dtos.response.*;

public interface CustomerServices {

    CustomerRegisterResponse registerCustomer(CustomerRegisterRequest request);
    LoginResponse login(LoginRequest request);



}
