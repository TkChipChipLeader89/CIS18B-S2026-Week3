//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;

// Main application class
public class App {
    public static void main(String[] args) {
        // Initialize pricing catalog
        PricingCatalog catalog = PricingCatalog.getInstance();
        // Display base price for a latte
        System.out.println("Base price for a latte: $" + catalog.getBasePrice("LATTE"));
        // Create Beverages
        Latte latte = new Latte(Beverage.Size.MEDIUM);
        ColdBrew coldBrew = new ColdBrew(Beverage.Size.LARGE);
        // Create Custom Beverage
        CustomDrink customDrink = new CustomDrink.Builder()
            .size(Beverage.Size.SMALL)
            .milk(CustomDrink.Milk.OAT)
            .espressoShots(2)
            .addExtra("Whipped Cream")
            .build();
        // Order
        Order order = new Order("N1");
        order.addItem(latte);
        order.addItem(coldBrew);
        order.addItem(customDrink);
        // Display total
        System.out.println("Order Total: $" + order.total());
    }
}