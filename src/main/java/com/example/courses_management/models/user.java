package com.example.courses_management.models;

public class user {
    private String first_name;
    private String last_name;
    private String email;
    private Number phone;
    private String password;
    public user(String first_name, String last_name, String email, Number phone, String password){
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.phone=phone;
        this.password=password;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(Number phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public Number getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }
}
