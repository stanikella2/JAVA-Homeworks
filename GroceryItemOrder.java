//#586, #3
public class GroceryItemOrder { //2
 private String name; //3.
 private int qty; //4
 private double price; //5
 public GroceryItemOrder(String name, int qty, double price){
  this.name = name;
  this.qty = qty;
  this.price = price;
 }
 public double getCost(){
   return qty * price;
 }
}