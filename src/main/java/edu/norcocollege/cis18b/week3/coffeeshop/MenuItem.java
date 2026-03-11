//package
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.math.BigDecimal;

//Class: MenuItem
public class MenuItem{

    //Private Variables
    private String sku;
    private String name;
    private BigDecimal price;

    //Constructor
    public MenuItem(String sku, String name, BigDecimal price){
        //Validation checks
        if(sku==null || sku.isBlank()){
            throw new IllegalArgumentException("SKU cannot be null or blank!");
        }
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or blank!");
        }
        if(price==null || price.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException("Price must be greater than or equal to 0!");
        }
        //If all checks pass, assign values
        this.sku = sku;
        this.name = name;
        this.price = price;
    }
    //Getters
    public String getSku() {
        return sku;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    //toString method
    @Override
    public String toString() {
        return "MenuItem{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}