// Assignment Name: 'Activity 2.5.7 String/Future/Password'

import java.util.Scanner;

public class VaildPassword {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // user is now informed of requirements :)
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
        boolean passLength = password.length() >= 10; // if function logic but better :cool:
        boolean addedCharacter = false;
        boolean diffCasedLetters = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); // char is a String, but one character in size
            if (c == '!' || c == '@' || c == '?' || c == '$' || c == '&' || c == '~') {
                addedCharacter = true;
                break; // only need to find one and leave loop
            }
        }
        
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)) || Character.isLowerCase(password.charAt(i))) {
                diffCasedLetters = true;
                break; // one and done
            }
        }

        System.out.println("---");
        if (passLength && addedCharacter && diffCasedLetters) {
            System.out.println("Password is valid.");
        } else {
            if (!passLength) { // unnecessary, but a want :)
                System.out.println("Does not contain at least ten characters. ");
            }
            if (!addedCharacter) {
                System.out.println("Does not contain a symbol(!, @, ?, $, &, ~). ");
            }
            if (!diffCasedLetters) {
                System.out.println("Does not contain at least 1 uppercase or lowercase letter.");
            }
        }
    }
}
