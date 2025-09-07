package com.ameer.interfaces.payment;

import static com.ameer.interfaces.payment.Formatter.MONEY_FORMAT;

public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }


    @Override
    public double calculatePayment() {
        return this.amountDue;
    }

    @Override
    public String getPayeeName() {
        return this.vendorName;
    }

    public void print() {
        System.out.printf(
                "Vendor Name: %s\nInvoice Number: %s\nCalculated Payment: %s\n",
                vendorName,
                invoiceNumber,
                MONEY_FORMAT.format(amountDue)
        );
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue < 0) {
            throw new IllegalArgumentException("Amount due cannot be negative.");
        }
        this.amountDue = amountDue;
    }
}
