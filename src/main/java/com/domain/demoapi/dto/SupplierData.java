package com.domain.demoapi.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class SupplierData {
    
    @NotEmpty(message = "Name should not be empty")
    private String name;

    @NotEmpty(message = "Address should not be empty")
    private String address;
    
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email is not valid")
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
