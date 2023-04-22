/* Program: Ch6 PC4 RetailItems
   Date: 03-18-19
   Author: Julie Rohach
   Description: This is part of a hw assignment for CIT111. It creates 3 RetailItem objects, takes no input, 
   & outputs the RetailItems' descriptions, units on hand, and prices in formatted strings. */
   
   public class RetailItems{
      public static void main(String[] args){
         
         RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
         RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
         RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
         
         System.out.printf("%-7s\t%-20s\t%-20s\t%-5s\n", " ", "Description", "Units on Hand", "Price");
         System.out.printf("Item #1\t%-20s\t%-20d\t$%-6.2f\n", item1.getDescription(), item1.getUnitsOnHand(), item1.getPrice());
         System.out.printf("Item #2\t%-20s\t%-20d\t$%-6.2f\n", item2.getDescription(), item2.getUnitsOnHand(), item2.getPrice());
         System.out.printf("Item #3\t%-20s\t%-20d\t$%-6.2f\n", item3.getDescription(), item3.getUnitsOnHand(), item3.getPrice());      }
   }