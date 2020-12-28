package com.csp.RenterAccountManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
    @Column
    @Id
    private Long phoneNumber;

    @Column
    private String firstName;
    @Column
    private String LastName;
    @Column
    private String email;
    @Column
    private String addressLineOne;
    @Column
    private String addressLinesTwo;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @Column
    private String zipCode;

    public Users() {
    }

    public Users(Long phoneNumber, String firstName, String lastName, String email, String addressLineOne, String addressLinesTwo, String city, String state, String country, String zipCode) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.addressLineOne = addressLineOne;
        this.addressLinesTwo = addressLinesTwo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLinesTwo() {
        return addressLinesTwo;
    }

    public void setAddressLinesTwo(String addressLinesTwo) {
        this.addressLinesTwo = addressLinesTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
