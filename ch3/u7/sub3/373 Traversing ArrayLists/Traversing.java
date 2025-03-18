// Assignment Name: '3.7.3 Traversing ArrayLists'

import java.util.ArrayList;

public class Traversing {
   public static void main(String[] args) {
      // Given array
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(10);
      numbers.add(20);
      numbers.add(30);
      numbers.add(40);
      numbers.add(50);

      // Standard for loop to print each number
      standardPrint(numbers);
      
      // Enhanced for loop to print each number
      enhancedPrint(numbers);

      // Calculating the sum using the standard for loop
      standardSum(numbers);

      // Calculating the sum using the enhanced for loop
      enhancedSum(numbers);
   }
   public static void standardPrint(ArrayList<Integer> list) {
      System.out.println("---");
      System.out.println("Printing using a standard for loop:");
      for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i));
      }
   }
   public static void enhancedPrint(ArrayList<Integer> arrayList) {
      System.out.println("---");
      System.out.println("Printing using an enhanced for loop:");
      for (Integer indexValues : arrayList) {
         System.out.println(indexValues);
      }
   }
   public static void standardSum(ArrayList<Integer> list) {
      int sum = 0;
      System.out.println("---");
      System.out.println("Printing the sum using a standard for loop:");
      for (int i = 0; i < list.size(); i++) {
         sum += list.get(i);
      }
      System.out.println(sum);
   }
   public static void enhancedSum(ArrayList<Integer> arrayList) {
      int sum = 0;
      System.out.println("---");
      System.out.println("Printing the sum using an enhanced for loop:");
      for (Integer indexValues : arrayList) {
         sum += indexValues;
      }
      System.out.println(sum);
   }
}
