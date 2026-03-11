//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;

// Class to hold pricing information for menu items
public class PricingCatalog {
    //private variables
    private static PricingCatalog instance;

    // Private constructor for singleton pattern
    private PricingCatalog() {}
    // Method to get singleton instance
    public static PricingCatalog getInstance() {
        if (instance == null) {
            instance = new PricingCatalog();
        }
        return instance;
    }
    // Method to get price for a menu item
    public BigDecimal getBasePrice(String productKey) {
        return switch(productKey) {
            case "LATTE":
                return new BigDecimal("4.50");
            case "COLD_BREW":
                return new BigDecimal("4.00");
            case "CUSTOM":
                return new BigDecimal("4.25");
            default:
                throw new IllegalArgumentException("Unknown product key: " + productKey);
        };
    }
}