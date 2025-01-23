import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = console.nextInt();
        
        System.out.println("Enter the divisor:");
        int divisor = console.nextInt();
        
        int originalNum = num;
        boolean isFactor = false;
        
        // Keep subtracting divisor from number until number becomes 0 or less than divisor
        while (num >= divisor) {
            num = num - divisor;
            if (num == 0) {
                isFactor = true;
                break;
            }
        }
        
        if (isFactor) {
            System.out.println(divisor + " is a factor of " + originalNum);
        } else {
            System.out.println(divisor + " is not a factor of " + originalNum);
        }
    }
}
