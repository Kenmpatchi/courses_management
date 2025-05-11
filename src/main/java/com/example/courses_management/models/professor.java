package com.example.courses_management.models;

public class professor extends user {
    private String role;
    public professor(String first_name, String last_name, String email, Number phone, String password){
        super(first_name,last_name,email,phone,password);
        this.role="professor";
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
