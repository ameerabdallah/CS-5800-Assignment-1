package com.ameer.inheritance.employee;

import java.text.DecimalFormat;

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage (e.g., 0.06 for 6%)
    private static final DecimalFormat PERCENT_DECIMAL_FORMAT = new DecimalFormat("##.##%");

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public void printEmployeeInfo() {
        printBasicInfo();
        System.out.printf("Gross Sales: %s\n", MONEY_FORMAT.format(grossSales));
        System.out.printf("Commission Rate: %s\n", PERCENT_DECIMAL_FORMAT.format(commissionRate));
    }
}
