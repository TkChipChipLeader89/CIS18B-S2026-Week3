//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;
import java.time.Instant;

// class GiftCardPayment implements PaymentMethod
public class GiftCardPayment implements PaymentMethod{
    //Variable to store balance
    private BigDecimal balance;
    //Constuctor
    public GiftCardPayment(BigDecimal balance) {
        if (balance == null || balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalStateException("Balance must be greater or equal to 0!");
        }
        this.balance = balance;
    }
    //Overide pay method to process gift card payment
    @Override
    public PaymentReceipt pay(String orderId, BigDecimal amount) {
        if (balance.compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient balance on gift card!");
        }
        balance = balance.subtract(amount);
        return new PaymentReceipt(orderId, amount, "GIFT_CARD", Instant.now());
    }
    // Getter for balance
    public BigDecimal getBalance() {
        return balance;
    }
}