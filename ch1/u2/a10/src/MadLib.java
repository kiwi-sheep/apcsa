import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Original story with placeholders
        String madLibStory = "There once was a [ADJECTIVE1] kiwi sheep that loved to roam the waters.\nBut not by [VERB1], no.\nHe traversed the seven seas by [VERB2].\nOne afternoon, however, he came across a [NOUN1] civilization, which stood in his path.\n[ADJECTIVE2], he approached the nation\nand he got by with [NUMBER1] injuries.\n'Maybe it was the [NOUN2] we made along the way that mattered', he thought to himself.\n'[ADJECTIVE3]', he then said to himself.\n";

        // Display the plain string w/ placeholders
        System.out.println("THE Story:\n");
        System.out.println(madLibStory);

        // Getting user inputs
        System.out.println("\nComplete the sentences mate! (correct capitalization please) :D\n");

        System.out.print("Please enter an adjective: ");
        String firAdj = scanner.nextLine();
        
        System.out.print("Please enter a verb: ");
        String firVerb = scanner.nextLine();

        System.out.print("Please enter another verb: ");
        String secVerb = scanner.nextLine();

        System.out.print("Please enter a noun: ");
        String firNoun = scanner.nextLine();

        System.out.print("Please enter another adjective: ");
        String secAdj = scanner.nextLine();

        System.out.print("Please enter a number: ");
        int firNum = scanner.nextInt();
        scanner.nextLine(); //buffer thingy

        System.out.print("Please enter another noun: ");
        String secNoun = scanner.nextLine();

        System.out.print("Please enter yet another adjective: ");
        String thrAdj = scanner.nextLine();

        // Replace placeholders with user input
        String completedStory = madLibStory.replace("[ADJECTIVE1]", firAdj);
        completedStory = completedStory.replace("[VERB1]", firVerb);
        completedStory = completedStory.replace("[VERB2]", secVerb);
        completedStory = completedStory.replace("[NOUN1]", firNoun);
        completedStory = completedStory.replace("[ADJECTIVE2]", secAdj);
        completedStory = completedStory.replace("[NUMBER1]", String.valueOf(firNum));
        completedStory = completedStory.replace("[NOUN2]", secNoun);
        completedStory = completedStory.replace("[ADJECTIVE3]", thrAdj);

        // Display the completed story
        System.out.println("\nHere is the completed Mad Lib story:\n");
        System.out.println(completedStory);
        
        scanner.close();
    }
}