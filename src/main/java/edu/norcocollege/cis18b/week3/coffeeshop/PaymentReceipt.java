//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;
import java.time.Instant;

// Record Payment Receipt
public record PaymentReceipt(
        String orderId, 
        BigDecimal amount, 
        String method, 
        Instant timestamp
){}
