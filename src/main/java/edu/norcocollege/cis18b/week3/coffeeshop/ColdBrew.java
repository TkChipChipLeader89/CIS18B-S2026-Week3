//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;
import java.math.RoundingMode;

//class for cold brew menu item
public class ColdBrew extends Beverage{
    //Base price for a cold brew
    private static final BigDecimal BASE_PRICE = new BigDecimal("4.00");
    //Constructor
    public ColdBrew(Size size){
        super("COLD_BREW", "Cold Brew", BASE_PRICE, size);
    }
}