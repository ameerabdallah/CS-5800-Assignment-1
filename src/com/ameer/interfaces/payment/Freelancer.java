package com.ameer.interfaces.payment;

import static com.ameer.interfaces.payment.Formatter.MONEY_FORMAT;

public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    @Override
    public double calculatePayment() {
        double overtimeHours = Math.max(hoursWorked - 40, 0.0);
        return (hourlyRate * 40) + (overtimeHours * hourlyRate * 1.5);
    }

    @Override
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    public void print() {
        System.out.printf(
                "Full Name: %s\nCalculated Payment: %s\n",
                getPayeeName(),
                MONEY_FORMAT.format(calculatePayment())
        );
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

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        this.hoursWorked = hoursWorked;
    }
}
