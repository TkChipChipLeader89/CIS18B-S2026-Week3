//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;

//class for cold brew menu item
public class ColdBrew extends Beverage{
    //Base price for a cold brew
    private static final BigDecimal BASE_PRICE = new BigDecimal("4.00");
    //Constructor
    public ColdBrew(String sku, Size size){
        super(sku, "Cold Brew", BASE_PRICE, size);
    }
    //Override get price method to include size multiplier
    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(getSizeMultiplier());
    }
}