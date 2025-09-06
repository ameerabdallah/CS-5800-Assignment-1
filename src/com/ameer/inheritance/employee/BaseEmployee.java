package com.ameer.inheritance.employee;

public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void printEmployeeInfo() {
        printBasicInfo();
        System.out.printf("Base Salary: %s\n", MONEY_FORMAT.format(baseSalary));
    }
}
