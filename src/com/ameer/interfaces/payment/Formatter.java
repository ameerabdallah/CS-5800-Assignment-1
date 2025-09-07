package com.ameer.interfaces.payment;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    public static final NumberFormat MONEY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
}
