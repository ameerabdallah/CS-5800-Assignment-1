package com.ameer.inheritance.employee;

public class HourlyEmployee extends Employee {
    private double wage; // wage per hour
    private double hours; // hours worked for week

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public void printEmployeeInfo() {
        printBasicInfo();
        System.out.printf("Hourly Wage: %s\n", MONEY_FORMAT.format(wage));
        System.out.printf("Hours Worked: %.2f hours\n", hours);
    }
}
