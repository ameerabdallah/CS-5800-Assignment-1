package com.ameer.inheritance.employee;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Employee {
    protected static final NumberFormat MONEY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    protected void printBasicInfo() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Social Security Number: " + socialSecurityNumber);
    }

    public abstract void printEmployeeInfo();
}
