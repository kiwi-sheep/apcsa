package ch2.u5; // feel free to delete (directory thing, package is a folder(?))

import java.util.Scanner;

public class InterestFormula {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the Investment Amount: ");
        int investAmount = scanner.nextInt();

        System.out.println("Input the Rate of Interest: ");
        double annualIntRate = scanner.nextDouble();

        System.out.println("Input the number of years: ");
        int numOYears = scanner.nextInt();
        
        System.err.println("--------------------------------");
        
        System.out.println("Year\t \t Future Value");
        FutureValues(investAmount, annualIntRate, numOYears);
    }
    
    public static void FutureValues(int varPV, double varR, int varN) {
        double temp;
        for (int i = 1; i <= varN; i++) {
            temp = Math.pow((1 + varR / 100), i);
            System.out.printf("%d\t \t %.2f\n", i, varPV * temp);
        }
    }
}
