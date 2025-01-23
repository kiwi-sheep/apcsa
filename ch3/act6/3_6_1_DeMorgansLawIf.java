
import java.util.Scanner;

public class DeMorgansLawIf {

    public static void partOne(boolean a, boolean b) { //First Part
        System.out.print("(NOT a) OR (NOT b) evaluates to ");

        boolean result; // Use of variable result for easier readability/understanding
        if (a) { // Same as: if (!a || !b)
            if (b) {
                result = true; // When both a and b are true
            } else {
                result = false; // When a is true and b is false
            }
        } else {
            result = true; // When a is false, regardless of b
        }

        if (result) { // Converting from variable result to print statement
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        System.out.print("NOT (a AND b) evaluates to ");
              
        if (a) { // Same as: if (!(a && b))
            if (b) {
                result = false; // When both a and b are true
            } else {
                result = true; // When a is true and b is false
            }
        } else {
            result = true; // When a is false, regardless of b
        }
        
        if (result) {
            System.out.println("true"); 
        } else {
            System.out.println("false");
        }

    }
    public static void partTwo(boolean a, boolean b) { //Second Part
        System.out.print("NOT (a OR b) evaluates to ");
        
        boolean result;
        if (a) { // Same as: if (!(a || b))
            result = false; // When a is true, regardless of b
        } else {
            if (b) {
                result = false; // When a is false and b is true
            } else {
                result = true; // When both a and b are false
            }
        }

        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("(NOT a) AND (NOT b) evaluates to ");

        if (!a) {
            if (!b) {
                result = true; // When both a and b are false
            } else {
                result = false; // When a is false and b is true
            }
        } else {
            result = false; // When a is true, regardless of b
        }

        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'true' or 'false' for A:");
        boolean a = sc.nextBoolean(); // Only accepts "true" or "false"

        System.out.println("Enter 'true' or 'false' for B:");
        boolean b = sc.nextBoolean();
        
        // Part One
        System.out.println("---");
        System.out.println("Part One:");
        partOne(a, b); // Results of Part One on a, b

        System.out.println("---");
        System.out.println("Testing all combinations for First Law:"); // As per stated
        partOne(false, false);
        partOne(false, true);
        partOne(true, false);
        partOne(true, true);

        // Formatting aka 'Separator'
        System.out.println("-------------------------------------");

        // Part Two
        System.out.println("Part Two:");
        partTwo(a, b); // Results of Part Two on a, b

        System.out.println("---");
        System.out.println("Testing all combinations for Second Law:"); // As per stated
        partTwo(false, false);
        partTwo(false, true);
        partTwo(true, false);
        partTwo(true, true);
    }
}
