package com.ameer.interfaces;

import com.ameer.interfaces.payment.Freelancer;
import com.ameer.interfaces.payment.Payable;
import com.ameer.interfaces.payment.VendorInvoice;

import java.util.ArrayList;
import java.util.List;

import static com.ameer.interfaces.payment.Formatter.MONEY_FORMAT;

public class InterfacesDriverProgram {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>(List.of(
                new Freelancer("Ameer", "Abdallah", 50.0, 45.0),
                new VendorInvoice("ABC Supplies", "INV-1001", 1500.0),
                new VendorInvoice("XYZ Services", "INV-1002", 2500.0),
                new Freelancer("John", "Doe", 60.0, 38.0)
        ));

        double totalPayments = 0.0;
        for (Payable payable : payables) {
            totalPayments += payable.calculatePayment();

            // Sort of feels like we should just add a print method to the interface, but that wasn't part of the
            // instructions, so leaving it out
            if (payable instanceof Freelancer) {
                ((Freelancer) payable).print();
            } else if (payable instanceof VendorInvoice) {
                ((VendorInvoice) payable).print();
            }
            System.out.println("===================================");
        }

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Total Payments: " + MONEY_FORMAT.format(totalPayments));
    }
}
