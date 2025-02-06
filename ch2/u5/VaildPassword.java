package ch2.u5; // feel free to delete (directory thing, package is a folder(?))

import java.util.Scanner;

public class VaildPassword {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.err.println("Password Requirements: "); 
        System.out.println("1. A password must have at least ten characters. ");
        System.out.println("2. A password consists of only letters, digits and a symbol(!, @, ?, $, &, ~). ");                                
        System.out.println("3. A password must at least 1 uppercase or lowercase letter.");


        System.out.println("---");
        System.out.print("Input a password: ");
        String password = scanner.next();

        passValidator(password);
    }

    public static void passValidator(String password) {
        boolean passLength = password.length() >= 10;
        boolean allowedChars = false;
        boolean diffCasedLetters = false;
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c == '!' || c == '@' || c == '?' || c == '$' || c == '&' || c == '~') {
                allowedChars = true;
                break;
            }
        }
        
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)) || Character.isLowerCase(password.charAt(i))) {
                diffCasedLetters = true;
                break;
            }
        }

        System.out.println("---");

        if (passLength && allowedChars && diffCasedLetters) {
            System.out.println("Password is valid.");
        } else {
            if (!passLength) {
                System.out.println("Does not contain at least ten characters. ");
            }

            if (!allowedChars) {
                System.out.println("Does not contain a symbol(!, @, ?, $, &, ~). ");
            }

            if (!diffCasedLetters) {
                System.out.println("Does not contain at least 1 uppercase or lowercase letter.");
            }
        }
    }
}