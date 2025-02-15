import java.util.Scanner;

public class RoShamBoExtra { // 'Main' class
    public static void main(String[] args) {    
        String userChoice;
        while (true) {
            userChoice = getUserChoice();
            if (userChoice.equals("quit")) {
                System.out.println("Good game. Fin.");
                break;
            }
            
            String compChoice = getCompChoice();
            System.out.println("Computer chose: " + compChoice);
            System.out.println("--");
            
            if (RPSLS.getWinner(userChoice, compChoice) == 1) {
                RPSLS.userWins++;
            } else if (RPSLS.getWinner(userChoice, compChoice) == 2) {
                RPSLS.compWins++;
            } else {
                RPSLS.ties++;
            }
            
            System.out.println("# o' User wins: " + RPSLS.userWins);
            System.out.println("# o' Computer wins: " + RPSLS.compWins);
            System.out.println("# o' Ties: " + RPSLS.ties);
            System.out.println("-----");
        }
    }
    public static String getUserChoice() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice (rock/paper/scissors/lizard/spock) or 'quit' to end: ");
        String userChoice = input.nextLine();
        userChoice = userChoice.toLowerCase(); // I'm too used to adding capital letters at the start of my typing

        if (userChoice.equals("quit")) {
            return userChoice;
        } else if (userChoice.equals("rock") || userChoice.equals("paper") || 
                   userChoice.equals("scissors") || userChoice.equals("lizard") || 
                   userChoice.equals("spock")) {
            return userChoice;
        } else {
            System.out.println("Invalid choice. Please try again.");
            return getUserChoice();
        }
    }
    public static String getCompChoice() {
        int randInteger = RandomizerClass.nextInt(1, 10) % 5;
        return switch (randInteger) { // testing new switch cases (better than a billion if statements)
            case 1 -> "rock";
            case 2 -> "paper";
            case 3 -> "scissors";
            case 4 -> "lizard";
            default -> "spock";
        };
    }
}

class RandomizerClass { 
    public static int nextInt() {
        int randInteger = (int)(Math.random() * (10) + 1);
        return randInteger;
    }
    public static int nextInt(int min, int max) {
        int randInteger = (int)(Math.random() * (max - min + 1) + min);
        return randInteger;
    }
}

class RPSLS { // Short for 'Rock-Paper-Scissors-Lizard-Spock'
    static int userWins;
    static int compWins;
    static int ties;

    static int getWinner(String user, String computer) {
        if (user.equals(computer)) {
            return 0; // returning 0 for tie
        } else if (user.equals("rock") && (computer.equals("scissors") || computer.equals("lizard"))) {
            return 1; // returning 1 for user win
        } else if (user.equals("paper") && (computer.equals("rock") || computer.equals("spock"))) {
            return 1;
        } else if (user.equals("scissors") && (computer.equals("paper") || computer.equals("lizard"))) {
            return 1;
        } else if (user.equals("lizard") && (computer.equals("spock") || computer.equals("paper"))) {
            return 1;
        } else if (user.equals("spock") && (computer.equals("scissors") || computer.equals("rock"))) {
            return 1;
        } else {
            return 2; // returning 2 for computer win
        } 
    }
}
