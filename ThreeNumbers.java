/*********************************
*Author: Kevin Reid
*Date: 09/19/2017
*Assignment: Sorting numbers
*Assignment number: A03
*objective: Sort 3 numbers from 
*the user in order from least to 
*greatest. 
*********************************/

import java.util.Scanner;

public class ThreeNumbers{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter 3 numbers separated by spaces: ");
      //assign a value to "n" integers
      int n1 = input.nextInt();
      int n2 = input.nextInt();
      int n3 = input.nextInt();
      
      //finding the lowest number
      if (n1 < n2 && n1 < n3){
         if(n2 < n3){
          System.out.printf("Sorted numbers: %d %d %d",n1,n2,n3);
          }
         else{
         System.out.printf("Sorted numbers: %d %d %d",n1,n3,n2);
         }
      }  
      //finding middle number
      if (n2 < n1 && n2 < n3){
         if(n1 < n3){
          System.out.printf("Sorted numbers: %d %d %d",n2,n1,n3);
          }
         else{
         System.out.printf("Sorted numbers: %d %d %d",n2,n3,n1);
         }
      }  
      //finding the last number
      if (n3 < n1 && n3 < n2){
         if(n1 < n2){
          System.out.printf("Sorted numbers: %d %d %d",n3,n1,n2);
          }
         else{
         System.out.printf("Sorted numbers: %d %d %d",n3,n2,n1);
         }
      }  
      
      
      
      
   }
}