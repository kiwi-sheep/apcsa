public class WhileLoop2 {
    public static void extractDigits(int number) {
        // Handle the case when number is 0 because 0 wasn't working before
        if (number == 0) {
            System.out.println(0);
            return;
        }
        
        // Store the digits in reverse order
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build reversed number
            number = number / 10; // Remove the last digit
        }
        
        // Print digits in original order
        while (reversedNumber > 0) {
            System.out.println(reversedNumber % 10); // Print last digit
            reversedNumber = reversedNumber / 10; // Remove the last digit
        }
    }

    public static void main(String[] args) {
        extractDigits(54321);
    }
}
