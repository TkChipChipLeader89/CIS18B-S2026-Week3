//package: edu.norcocollege.cis18b.week3.coffeeshop
package edu.norcocollege.cis18b.week3.coffeeshop;

//imports
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;

//class: Order
public class Order {
    //Private Variables
    private List<MenuItem> items;
    private String orderId;
    
    //constructor
    public Order(String orderId){
        //validation checks
        if(orderId==null || orderId.isBlank()){
            throw new IllegalArgumentException("Order ID cannot be null or blank!");
        }
        //initialization
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }
    //add item method
    public void addItem(MenuItem item){
        if(item==null){
            throw new IllegalArgumentException("Item cannot be null!");
        }
        this.items.add(item);
    }
    //Get items method
    public List<MenuItem> getItems() {
        return Collections.unmodifiableList(items);
    }
    //Get order ID method
    public String getOrderId() {
        return orderId;
    }
    //total method
    public BigDecimal total(){
        BigDecimal total = BigDecimal.ZERO;
        for(MenuItem item : items){
            total = total.add(item.getPrice());
        }
        return total;
    }
}