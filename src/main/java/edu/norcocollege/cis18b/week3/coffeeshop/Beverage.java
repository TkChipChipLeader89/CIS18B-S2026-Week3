//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;
import java.math.RoundingMode;

//class for beverage menu item
public abstract class Beverage extends MenuItem{
    //enum for beverage size
    public enum Size {
        SMALL, 
        MEDIUM, 
        LARGE
    }
    //Private variable for size
    private Size size;
    //Constructor
    public Beverage(String sku, String name, BigDecimal basePrice, Size size){
        super(sku, name, basePrice);
        if(size==null){
            throw new IllegalArgumentException("Size cannot be null!");
        }
        this.size = size;
    }
    //Size multiplier method
    public BigDecimal getSizeMultiplier(){
        switch(size){
            case SMALL:
                return new BigDecimal("1.00");
            case MEDIUM:
                return new BigDecimal("1.20");
            case LARGE:
                return new BigDecimal("1.40");
            default:
                throw new IllegalStateException("Unexpected size: " + size);
        }
    }
    //override get price
    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(getSizeMultiplier()).setScale(2, RoundingMode.HALF_UP);
    }    
}