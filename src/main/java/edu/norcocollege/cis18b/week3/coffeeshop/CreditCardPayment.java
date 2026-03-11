//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;

// class that implements the PaymentMethod interface for credit card payments
public class CreditCardPayment implements PaymentMethod {
    //Variable to store last 4 digits
    private String last4Digits;
    // Constructor
    public CreditCardPayment(String last4) {
        //validate last 4 digits
        if (last4 == null || last4.length() != 4) {
            throw new IllegalArgumentException("Must be exactly 4 Characters.");
        }
        this.last4Digits = last4;
    }
    // Implement the pay method
    @Override
    public PaymentReceipt pay(String orderId, BigDecimal amount) {
        //Process Payment 
        String method = "CREDIT_CARD(****" + last4Digits + ")";
        // Return a payment receipt
        return new PaymentReceipt(orderId, amount, method, java.time.Instant.now());
    }
}