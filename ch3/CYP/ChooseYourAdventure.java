package ch3.proj; // feel free to delete (directory thing, package is a folder)
/*=============================================================================
 |   Assignment:  Program #1.3.8 Choose Your Path
 |       Author:  Alejandro Villa
 |      Partner:  N/A
 |
 |  Course Name:  AP Computer Science A
 |   Instructor:  Mr. Virak
 |     Due Date:  11/06/2024
 |
 |  Description:  This program implements an interactive text-based soccer game
 |                where the player makes intense decisions in a World Cup final
 |                match. The player faces multiple choice decisions that affect
 |                the game's outcome, from dribbling through midfielders to
 |                making the final shot on goal. Each decision branch leads to
 |                different endings (e.g., "True, Good Ending", "Humbled Ending",
 |                etc.), simulating the pressure and consequences of split-second
 |                decisions in a high-stakes soccer match. All being held together
 |                through if statements and boolean variables.
 |
 |     Language:  [ Java version 8]
 |     Packages:  package "ch3.proj" used for the directory,  
 |                java.util.Scanner used for the scanner.
 |                
 | Deficiencies:  No unsatisfied requirements and no logic errors.
 *===========================================================================*/

import java.util.Scanner;

public class ChooseYourAdventure {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean onLeft = false;
    boolean onRight = false;

    System.out.println("Picture this scene: You've made it all the way to the world cup final, 80,000 people in the stands, you down on the field. The score is 0-0 in the 2nd half of extra time. (Type 1 or 2 for ALL choices.)");
    System.out.println("You are in the middle of the field, with the ball at your feet. 2 midfielders are standing in front of you, and a teammate is on your left. Do you:");
    System.out.println("1. Dribble through the midfielders.");
    System.out.println("2. Pass to your teammate on the left.");
    System.out.println("3. Pass to your teammate on the right.");
    
    int choice = scanner.nextInt();
  
    if (choice == 1) {
      System.out.println("You chose on going for a dribble! Do you:");
      System.out.println("1. Fake your way through.");
      System.out.println("2. Heel-kick the ball over the midfielders.");
      
      choice = scanner.nextInt();
      if (choice == 1) {
        System.out.println("Your fake was ineffective, you lost the push and the enemy countered, scoring a goal. gg (Humbled Ending)");
        return;
      } else {
        System.out.println("Your heel-kick went too far into enemy territory. Do you: ");
        System.out.println("1. Dribble through the defenders.");
        System.out.println("2. Pass to your teammate on the left.");
        
        choice = scanner.nextInt();
        if (choice == 1) {
          System.out.println("You were too close to the defenders after getting hold of the ball and lost it. gg (Ball Hog Ending)");
          return;
        } else {
          System.out.println("By being too close, your pass got intercepted , and the enemy scored. gg (No Spacing Ending)");
          return;
        }
      }
    } else if (choice == 2) {
      onLeft = true;
    } else {
      onRight = true;
    }
    
    if (onLeft || onRight) {
      System.out.println("Passed to your teammate. Your teammate got through the midfielders, but now is caught by defense. Do you:");
      System.out.println("1. Run closer to your teammate to help.");
      System.out.println("2. Go for the open space on the opposite side of the field.");
      
      choice = scanner.nextInt();
      if (choice == 1) {
        System.out.println("Your teammate launched the ball to where you were before, and it was intercepted, causing the enemy to score. gg (Bad Communication Ending)");
        return;
      
      } else {
        System.out.println("YOU'VE GOT THE BALL IN FRONT OF THE GOAL! Do you:");
        System.out.println("1. TAKE THE SHOT!!!");
        System.out.println("2. Pass it to the teammate 6 meters away to guarantee a goal.");
        
        choice = scanner.nextInt();
        if (choice == 1 && onLeft) {
          System.out.println("GOOOAAAL! YOU'VE SCORED THE WINNING GOAL! GG!!! (True, Good Ending)");
        
        } else if (choice == 1 && onRight) {
          System.out.println("YOUR SHOT WAS BLOCKED BY A SNEAKY RIGHT DEFENDER! NOOOOO (Blocked Ending)");
        
        } else {
          System.out.println("By passing, you set up your teammate up for a goal, yet your teammate missed the shot. gg (Too-Much-Teamwork Ending)");
        }
      }
    }
  }
}