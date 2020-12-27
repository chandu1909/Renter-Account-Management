package com.csp.RenterAccountManagement.business;

public class Renter {

    private String firstName;
    private String LastName;
    private String email;
    private String phoneNumber;
    private String addressLineOne;
    private String addressLinesTwo;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private int numOfToolsToRent;
    private int toolId;

    public Renter() {

    }

    public Renter(String firstName, String lastName, String email, String phoneNumber, String addressLineOne, String addressLinesTwo, String city, String state, String country, String zipCode, int numOfToolsToRent, int toolId) {
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addressLineOne = addressLineOne;
        this.addressLinesTwo = addressLinesTwo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.numOfToolsToRent = numOfToolsToRent;
        this.toolId = toolId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public int getNumOfToolsToRent() {
        return numOfToolsToRent;
    }

    public void setNumOfToolsToRent(int numOfToolsToRent) {
        this.numOfToolsToRent = numOfToolsToRent;
    }

    public int getToolId() {
        return toolId;
    }

    public void setToolId(int toolId) {
        this.toolId = toolId;
    }


}
