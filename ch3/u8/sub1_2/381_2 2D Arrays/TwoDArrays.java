// Assignment Name: 'Activity 3.8.1 & 2.8.2 2D Arrays'
import java.util.Random;

public class TwoDArrays {
   public static void main(String[] args) {  
      Random generator = new Random(); // Used for test cases

      // // 2D array representing daily temperature data for 4 regions over 7 days (used for test cases)
      // int[][] temperatures = new int[4][7];

      // // Creating the array with random values between 50 and 97 degrees
      // for (int[] row : temperatures) {
      //    for (int i = 0; i < row.length; i++) {
      //       row[i] = generator.nextInt(50, 97);
      //    }
      // }

      // GIVEN 2D array representing daily temperature data for 4 regions over 7 days
      int[][] temperatures = {
         {65, 70, 68, 72, 75, 77, 80},  // Region 1 temperatures (7 days)
         {60, 63, 65, 67, 70, 73, 75},  // Region 2 temperatures (7 days)
         {55, 59, 62, 64, 66, 68, 70},  // Region 3 temperatures (7 days)
         {50, 53, 55, 58, 60, 62, 64}   // Region 4 temperatures (7 days)
     };

      displayTemperatures(temperatures);
      generalMinMax(temperatures);
      regionMinMax(temperatures);
   }
   public static void displayTemperatures(int[][] array) { // Shows the 2D array in a readable format
      System.out.println("Temperature Data for the Forest (Regions and Days): ");
      System.out.println("---");
      System.out.println("Days Recorded: 1 2 3 4 5 6 7");
      System.out.println("-");
      System.out.println("Temperatures for each Region:");
      for (int r = 0; r < array.length; r++) { // Prints all values in a formatted manner
         System.out.print("Region " + (r + 1) + ":"); // (r + 1) because r starts from 0, not 1
         for (int c = 0; c < array[r].length; c++) {
            System.out.print (" " + array[r][c]);
         }
         System.out.println();
      }
      System.out.println();
   }
   public static void generalMinMax(int[][] array) { // Prints the entire 2D array's min and max
      int max = array[0][0]; // Set the first value as the default min and max
      int min = array[0][0]; // Not inside enhanced for loop because we want only one max and min
      for (int[] r : array) { // Enhanced because the index isn't necessary here
         for (int c = 0; c < r.length; c++) {
            if (r[c] > max) { // If value is more than max, set it to max
               max = r[c];
            } if (r[c] < min) { // If value is less than min, set it to min
               min = r[c];
            }
         }
      }
      System.out.println("Maximum Temperature in the Entire Forest: " + max);
      System.out.println("Minimum Temperature in the Entire Forest: " + min);
   }
   public static void regionMinMax(int[][] array) { // For each row in the 2D array, print the min and max
      System.out.println("\nMax/Min Temperature for each Region:");
      for (int r = 0; r < array.length; r++) { // Not an enhanced for loop because the index is used when calling out the region #
         int max = array[r][0]; // Not array[0][0] because we ONLY want values from the row, not entire array
         int min = array[r][0]; // Inside for loop because we want pairs of min and max for each row
            for (int c = 0; c < array[r].length; c++) {
               if (array[r][c] > max) { // If value is more than max, set it to max
                  max = array[r][c];
               } else if (array[r][c] < min) { // If value is less than min, set it to min
                  min = array[r][c];
               }
            }
            System.out.print("Region " + (r + 1) + " - Maximum Temperature:"); // (r + 1) because r starts from 0, not 1
            System.out.println (" " + max);

            System.out.print("Region " + (r + 1) + " - Minimum Temperature:");
            System.out.println (" " + min);

            System.out.println(); // Just because I'm picky with formatting
         }
   }
}
