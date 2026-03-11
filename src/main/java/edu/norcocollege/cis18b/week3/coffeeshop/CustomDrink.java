//package 
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

// Custom drink class
public class CustomDrink extends Beverage {
    // List of custom milks
    public enum Milk { WHOLE, OAT, ALMOND, SKIM }
    // List of Custom Syrups
    public enum Syrup { VANILLA, CARAMEL, HAZELNUT, NONE }
    // List of Custom Temperatures
    public enum Temperature { HOT, ICED }
    //Private fields for customizations
    private Milk milk;
    private Syrup syrup;
    private Temperature temperature;
    private int espressoShots;
    private List<String> extras;
    private static final BigDecimal BASE_PRICE = new BigDecimal("4.25");
    //Constructor
    public CustomDrink(String sku, Size size, Milk milk, Syrup syrup, Temperature temperature, int espressoShots, List<String> extras) {
        super(sku, "Custom Drink", BASE_PRICE, size);
        this.milk = milk;
        this.syrup = syrup;
        this.temperature = temperature;
        this.espressoShots = espressoShots;
        this.extras = extras;
    }
    //Override get price method to include customizations
    @Override
    public BigDecimal getPrice() {
        BigDecimal price = super.getPrice();
        // Add cost for extra espresso shots
        price = price.add(new BigDecimal(espressoShots).multiply(new BigDecimal("0.75")));
        // Add cost for syrup
        if(syrup != Syrup.NONE) {
            price = price.add(new BigDecimal("0.50"));
        }
        // Add cost for each extra
        price = price.add(new BigDecimal(extras.size()).multiply(new BigDecimal("0.25")));
        return price;
    }
    // Builders for custom drink
    public static class Builder {
        //Private fields & default values for builder
        private String sku;
        private Size size = Size.MEDIUM;
        private Milk milk = Milk.WHOLE;
        private Syrup syrup = Syrup.NONE;
        private Temperature temperature = Temperature.HOT;
        private int espressoShots = 1;
        private List<String> extras = new ArrayList<>();
        //Builder methods
        public Builder(String sku) {
            this.sku = sku;
        }
        public Builder size(Size size) {
            this.size = size;
            return this;
        }
        public Builder milk(Milk milk) {
            this.milk = milk;
            return this;
        }
        public Builder syrup(Syrup syrup) {
            this.syrup = syrup;
            return this;
        }
        public Builder temperature(Temperature temperature) {
            this.temperature = temperature;
            return this;
        }
        public Builder espressoShots(int shots) {
            if(shots < 1) {
                throw new IllegalArgumentException("Espresso shots must be greater or equal to 1!");
            }
            this.espressoShots = shots;
            return this;
        }
        public Builder addExtra(String extra) {
            if(extra == null || extra.isBlank()) {
                throw new IllegalArgumentException("Extra cannot be null or blank!");
            }
            this.extras.add(extra);
            return this;
        }
        public CustomDrink build() {
            return new CustomDrink(sku, size, milk, syrup, temperature, espressoShots, extras);
        }
    }
}