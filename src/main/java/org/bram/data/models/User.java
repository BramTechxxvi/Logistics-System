package org.bram.data.models;

import lombok.Data;

@Data
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String Address;

}
