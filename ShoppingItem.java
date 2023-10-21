/**@Gilbert CS145 Shopping Item
  *@version 1.0 (04/05/2023)
  *@see ShoppingItem class*/
public class ShoppingItem {
   private String name;    //Name of the shopping item
   private int quantity;   //quantity
   private double price;   //price per unit
   /**Construct and initialize the shopping item with name, quantity, and price per unit
   @param name the name of the item
   @param quantity the quantity of the item
   @param pricePerUnit the price of the item*/
   public ShoppingItem (String name, int quantity, double pricePerUnit) {
      this.name = name;
      this.quantity = quantity;
      this.price = pricePerUnit;     
   }
   /**returns a name of the item
   @return the name of the item*/
   public String getName(){ //gets the name of the item
      return name;
   }
   /**returns the quantity multiplied by the price of the item
   @return the cost of the item*/
   public double getCost(){ //get the cost
      return quantity * price;
   }
   /**gets an input for how many items will there be
   @param quantity the quantity of a specific item*/
   public void setQuantity(int quantity){ //gets the quantity of the item
      this.quantity = quantity;
   }
   /**returns the quantity and the name of the item
   @return how many duplicates of each item in the shopping cart*/
   public String toString() {
      return quantity + " " + name;
   }
}
