// Assignment Name: 'Activity 3.7.5 Searching'

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Searching {

    // Method to perform linear search
    public static int linearSearch(ArrayList<Integer> list, int target) {
        // Loop through each element
        for (int i = 0; i < list.size(); i++) {
            // If element matches target, return its index
            if (list.get(i) == target) {
                return i;
            }
        }
        // If target not found, return -1 (since no index can be -1)
        return -1;
    }

    public static void main(String[] args) {
        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();        
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Generate and store 100 random integers (0-999)
        for (int i = 0; i < 100; i++) {
            numbers.add(rand.nextInt(1000));
        }

        // Print array in full
        System.out.println("Generated ArrayList of 100 numbers: ");
        System.out.println(numbers);
        
        // Prompting user to input a number (target) they want to search for in the ArrayList
        System.out.println("---");
        System.out.print("\nEnter a number to search for (0-999): ");
        int target = scanner.nextInt();
        
        // Perform the linear search
        int result = linearSearch(numbers, target);
        
        // Display results
        if (result != -1) { // If the result was not (!=), not found (-1)...
            System.out.println("The number " + target + " was found at index " + result + ".");
        } else {
            System.out.println("The number " + target + " was not found in the list");
        }
    }
}
