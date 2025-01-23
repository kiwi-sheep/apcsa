
import java.util.Scanner;

public class DeMorgansLaw {

    public static void partOne(boolean a, boolean b) { // First Part
        System.out.print("(NOT a) OR (NOT b) evaluates to ");
        
        if (!a || !b) { // First Case (or)
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        System.out.print("NOT (a AND b) evaluates to "); 

        if (!(a && b)) { // Second Case (and)
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
        public static void partTwo(boolean a, boolean b) { // Second Part
            System.out.print("NOT (a OR b) evaluates to ");

        if (!(a || b)) { //First Case (or)
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("(NOT a) AND (NOT b) evaluates to ");

        if (!a && !b) { //Second Case (and)
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
        System.out.println("Testing all combinations for Second Law:"); //As per stated
        partTwo(false, false);
        partTwo(false, true);
        partTwo(true, false);
        partTwo(true, true);
    }
}
