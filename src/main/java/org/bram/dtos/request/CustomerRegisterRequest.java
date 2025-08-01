package org.bram.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerRegisterRequest {

    @NotBlank(message = "Enter your first name")
    private String firstName;
    @NotBlank(message = "Enter your last name")
    private String lastName;
    @NotBlank(message = "Enter your email")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}$ ", message = "Invalid email")
    private String email;
    @NotBlank(message = "Enter your phone number")
    @Pattern(regexp = "^0[7-9][0-1]\\d[- ]?\\d{3}[- ]?[0-9]{4}$", message = "Invalid phone number")
    private String phoneNumber;
    @NotBlank(message = "Enter your password")
    @Size(min = 8, max = 16, message = "Password must be between 8 to 16 characters")
    private String password;
    @NotBlank(message = "Enter your address")
    private String Address;

}

