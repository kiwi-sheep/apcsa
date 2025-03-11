import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        String userInput;

        while (true) {
            System.out.println("Enter a number, or the letter 'q' to end the sequence: ");
            userInput = console.nextLine();
            
            if (userInput.equalsIgnoreCase("q")) {
                break;
            }
            
            try {
                double number = Double.parseDouble(userInput);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }
        }

        System.out.println("The sum is: " + sum);
        if (count > 0) {
            System.out.println("The average is: " + (sum / count));
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
