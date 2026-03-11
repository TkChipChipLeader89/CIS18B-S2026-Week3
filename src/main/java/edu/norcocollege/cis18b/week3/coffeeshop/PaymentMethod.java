//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;

// interface for payment methods
public interface PaymentMethod{
    // Process payment
    PaymentReceipt pay(String orderId, BigDecimal amount);
}