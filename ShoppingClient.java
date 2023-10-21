/**@Gilbert CS145 Shopping Client
  *@version 1.0 (04/14/2023)
  *@see ShoppingClient class*/
import java.util.Scanner;
public class ShoppingClient {
   public static void main (String[] args) {
      ShoppingList List = new ShoppingList();
      while (true) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter a number from 1 to 5:");
         System.out.println("1. Display menu");
         System.out.println("2. Add a shopping item");
         System.out.println("3. Change item quantity");
         System.out.println("4. Display shopping list");
         System.out.println("5. Exit the program");
         System.out.println();
         while (!scan.hasNextInt()) {
            System.out.println("Your input must be an integer, please try again.");
            scan.next();
         }
         int userInput = scan.nextInt();
         if (userInput == 1) {
            System.out.println("Here is the menu:");
            System.out.println("1. Milk");
            System.out.println("2. Eggs");
            System.out.println("3. Beef");
            System.out.println("4. Bacon");
            System.out.println("5. Yoghurt\n");   
         }
         if (userInput == 2) {
            System.out.print("Enter the shopping item: ");
            String s = scan.next();
            int i;
            while (true){
               System.out.print("Enter the quantity: ");
               if (!scan.hasNextInt()) {
                  System.out.println("Your quantity must be a whole number.");
                  scan.next();
               }
               else {
                  i = scan.nextInt();
                  break;
               }
            }
            double d;
            while (true) {
               System.out.print("Enter the price: ");
               if (!scan.hasNextDouble()) {
                  System.out.println("Your price must be a number.");
                  scan.next();
               }
               else {
                  d = scan.nextDouble();
                  break;
               }
            }
            System.out.println();
            /**gets an input for a name for an item, the quantity, and the price
            @param s gets the name of the item
            @param i gets the quantity of the item
            @param d gets the price of the item
            @param Item adds the item to the shopping cart*/       
            ShoppingItem Item = new ShoppingItem(s, i, d);
            if(!List.add(Item)){
               System.out.println("Shopping cart is full.\n");
            }
            else {
            System.out.println("Your item was succesfully added. \n");
            }
         }
         if (userInput == 3) {
            ShoppingItem Item;
            System.out.println("Which item do you wish to change?");
            String name = scan.next();
            /**gets an exception if the input is not an integer
            @param name searches for the name
            @throws exception if the new quantity is not an integer*/
            Item = List.searchByName(name);
            if (Item != null) {
               System.out.println("Please enter a new quantity for "+ Item.getName()+".");
               try {
                  int newQuantity = scan.nextInt();
                  Item.setQuantity(newQuantity);
                  System.out.println("Quantity updated successfully. \n");
               } 
               catch(Exception e) {
                  System.out.println("Your input must be an integer. \n");
                  
               }
            }
            else {
               System.out.println();
               System.out.println("The item you entered was not found.\n");
            }
         }
         if (userInput == 4) {
            System.out.println(List.toString());
            double finalPrice = List.getTotalCost();
            int space = 10 - List.getSize();
            System.out.println("You have " + space + " more space(s) in your shopping cart.");
            System.out.printf("Your total price will be: $%.2f \n", finalPrice);
            System.out.println();
         }
         if (userInput == 5) {
            break;
         }
      }
   }
}
