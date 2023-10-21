/**@Gilbert CS145 Shopping List
  *@version 1.0 (04/07/2023)
  *@see ShoppingList class*/
public class ShoppingList {
   private ShoppingItem [] items; //declares an array
   private int size; //size of the item inside the list 
   public ShoppingList() {
      items = new ShoppingItem[10]; //generates a size of 10 items in a shopping list
      size=0;
   }
   /**adds a new item to the shopping cart
   @param newItem add a new item to the shopping cart
   @return a boolean whether the shopping cart is full or not*/
   public boolean add (ShoppingItem newItem) { 
      if(this.size >=10) {
         return false;
      }     
      else{
         items[size] = newItem;
         this.size+=1;
         return true;
      }
   }
   /**returns the final cost of the item
   @return the cost for the total number of items*/
   public double getTotalCost() { 
      double sum=0;
      for (int i=0; i<size; i++) {
         sum += this.items[i].getCost();
      }
      return sum;
   }  
   /**returns the display of how many items in your shopping cart
   @return the total items in your shopping cart*/
   public String toString() {     
      if(size<=0){
         return "No Items in your shopping list";
         }
      else {
         String str = items[0].toString();
         for(int i = 1; i < size; i++){
            str += ", " + items[i].toString();
         }
      return str;
      }
   }
   /**search the item in the shopping cart
   @param newItem searches for the specified item*/
   public ShoppingItem searchByName (String newItem) {
      for (int i = 0; i < size; i++){
         if (newItem.equalsIgnoreCase(items[i].getName())) {
            return items[i];
         }
      }
      return null;
   }  
   public int getSize(){
   return this.size;
   }
}