// Assignment Name: 'Activity 2.5.7 String/Future/Password'

import java.util.Scanner;

public final class InterestFormula {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // User choices/inputs
        System.out.println("Input the Investment Amount: ");
        int investAmount = scanner.nextInt();

        System.out.println("Input the Rate of Interest: ");
        double annualIntRate = scanner.nextDouble();

        System.out.println("Input the number of years: ");
        int numOYears = scanner.nextInt();
        
        // Output
        System.err.println("--------------------------------");
        System.out.println("Year\t \t Future Value");
        FutureValues(investAmount, annualIntRate, numOYears);
    }
    
    public static void FutureValues(int varPV, double varR, int varN) {
        double temp; // doing the brackets part of equation of each year
        for (int i = 1; i <= varN; i++) {
            temp = Math.pow((1 + (varR / 100)), i);

            // Printf is used to print in two decimal places, rather than the annoying ~10 from a double
            System.out.printf("%d\t \t %.2f\n", i, varPV * temp); 
            // also, very cool. Did not know I could do cool formatting with printf. I should remember that for later.
        }
    }
}
