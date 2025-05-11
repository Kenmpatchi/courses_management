package com.example.courses_management.models;

public class Student extends user{
    private String role;
    public Student(String first_name, String last_name, String email, Number phone, String password){
        super(first_name,last_name,email,phone,password);
        this.role="student";
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
