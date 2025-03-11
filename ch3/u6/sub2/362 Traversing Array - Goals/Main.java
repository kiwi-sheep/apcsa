// Assignment Name: 'Activity 3.6.2 Traversing Array - Goals'

public class Main {
    public static void main(String[] args) {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        
        // Test print
        System.out.print("--\nThe goals scored were ");
        printNormal(goals);
        
        // Test reverse print
        System.out.print("\n--\nThe goals scored backwards are ");
        reversePrint(goals);
        
        // Test countZero
        System.out.println("\n-----\nPrinting games that scored 0 goals:");
        countZero(goals);

        // Test getAverage
        System.out.println("\n---\nThe average number of goals score per game is " + getAverage(goals));
        
        // Test switchFirstSecond
        switchFirstSecond(goals);
        System.out.print("\n---\nThe actual goals were ");
        printNormal(goals);
    }
    // Prints the array elements in normal order (left to right)
    public static void printNormal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println("and " + arr[i] + ".");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
    // Prints the array elements in reverse order (right to left)
    public static void reversePrint(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println("and " + arr[i] + ".");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
    // Counts and prints the games where no goals were scored (zero goals)
    public static void countZero(int[] arr) {
        // Counter for games with no goals
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("We scored 0 goals in game " + (i + 1));
                zeroCount++;
            }
        }
        System.out.println("We had " + zeroCount + " games, where we did not score a goal.");
    }
    // Calculates the average number of goals per game. Rounds the result to 2 decimal places
    public static double getAverage(int[] arr) {
        // Calculate sum using enhanced for loop
        double sum = 0;
        for (int goal : arr) {
            sum += goal;
        }
        // Round to 2 decimal places using multiplication and division by 100.0
        return Math.round((sum / arr.length) * 100.0) / 100.0;
    }
    // Swaps the first two elements of the array. Only performs the swap if the array has at least 2 elements
    public static void switchFirstSecond(int[] arr) {
        if (arr.length >= 2) {
            // Use temporary variable for the swap
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }
}