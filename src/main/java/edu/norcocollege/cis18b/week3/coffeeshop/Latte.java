//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;
import java.math.RoundingMode;

//class for latte menu item
public class Latte extends Beverage{
    //Base price for a latte
    private static final BigDecimal BASE_PRICE = new BigDecimal("4.50");
    //Constructor
    public Latte(Size size){
        super("LATTE", "Latte", BASE_PRICE, size);
    }
}