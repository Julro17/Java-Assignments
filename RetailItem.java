/* Program: Ch6 PC4 RetailItem Class
   Date: 03-18-19
   Author: Julie Rohach
   Description: This is part of a homework assignment for CIT111. It allows the creation of an object that 
   represents a product in a store and holds 1 string, 1 int, & 1 double as its relevant data. */
   
   public class RetailItem{
      
      String description;
      int unitsOnHand;
      double price;
      
      public void setDescription(String details){
         description = details;
      }
      
      public void setUnitsOnHand(int stock){
         unitsOnHand = stock;
      }
      
      public void setPrice(double cost){
         price = cost;
      }
      
      public String getDescription(){
         return description;
      }
      
      public int getUnitsOnHand(){
         return unitsOnHand;
      }
      
      public double getPrice(){
         return price;
      }
      
      public RetailItem(String detail, int stock, double cost){
         description = detail; unitsOnHand = stock; price = cost;
      }
   }
