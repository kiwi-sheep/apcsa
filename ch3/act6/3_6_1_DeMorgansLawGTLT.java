import java.util.Scanner; 

public class DeMorgansLawGTLT
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number for X");
    int x = Integer.parseInt(sc.nextLine()); 

    System.out.println("Enter a number for Y");
    int y = Integer.parseInt(sc.nextLine()); 
    
    System.out.println("Checking that both x and y are not negative ... ");
    if (!(x < 0) && !(y < 0)) {
      System.out.println("Both x and y are not negative");
    }
    
    // De Morgan's Law equivalent: !(A || B) = !A && !B
    // In this case: !(x < 0 || y < 0) = !(x < 0) && !(y < 0)
    if (x >= 0 && y >= 0) {  // Short-circuit: if (x < 0),then y isn't evaluated
      System.out.println("Both x and y are not negative");
    } else {
      System.out.println("at least one number is negative");
    }
  }
}
