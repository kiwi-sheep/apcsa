package ch2.u5; // feel free to delete (directory thing, package is a folder(?))

import java.util.Scanner;

public class StringMiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a string: ");
        String text = scanner.nextLine();

        System.err.println("---");

        if (text.length() % 2 == 0) { // finding the middle character and printing it accordingly
            System.out.println("The middle character in the string : " + text.substring((text.length() / 2) - 1, text.length() / 2 + 1));
        } else {
            System.out.println("The middle character in the string : " + text.substring(text.length() / 2, text.length() / 2 + 1));
        }
    }
}
