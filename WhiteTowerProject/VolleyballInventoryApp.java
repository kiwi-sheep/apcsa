/*=============================================================================
 |   Assignment:  White Tower Project
 |       Author:  Alejandro Villa
 |      Partner:  N/A
 |
 |  Course Name:  AP Computer Science A
 |   Instructor:  Mr. Virak
 |     Due Date:  2025-05-23
 |
 |  Description:  Manage the inventory of a volleyball, including checking out, 
 |                returning, adding, viewing, finding missing, checking air 
 |                pressure, and inflating balls.
 |
 |     Language:  Java version 8
 | Ex. Packages:  None.
 |                
 | Deficiencies:  No logic errors, no unsatisfied requirements.
 *===========================================================================*/


import java.util.ArrayList;
import java.util.Scanner;

public class VolleyballInventoryApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        
        manager.startProgram(); // Starts "While True" function/method/loop
    }
}

// Super Class for "Volleyball" Class
class SportsEquipment { // Used for the generic ball, but file will be specific to volleyballs (due to personal annoyances with such when searching for one)
    private String equipmentType;
    private boolean isAvailable;
    
    public SportsEquipment(String type) {
        this.equipmentType = type;
        this.isAvailable = true;
    }
    
    public String getEquipmentType() {
        return equipmentType;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    
    @Override  // Orignal toString() function is being overwritten to a new style/formatting
    public String toString() {
        return equipmentType + " - " + (isAvailable ? "Available" : "Checked Out");
    }
}

// Subclass to "SportsEquipment" Class
class Volleyball extends SportsEquipment { // 
    private int ballId;
    private String color;
    private String condition;
    private double airPressure; // 0.0 to 1.0 (0 = completely flat, 1.0 = fully inflated)
    
    public Volleyball(int id, String color, String condition, double airPressure) {
        super("Volleyball");
        this.ballId = id;
        this.color = color;
        this.condition = condition;
        setAirPressure(airPressure); // Using setter for validation
    }
    
    // Getters and setters
    public int getBallId() {
        return ballId;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getCondition() {
        return condition;
    }
    
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    public double getAirPressure() {
        return airPressure;
    }
    
    public void setAirPressure(double airPressure) {
        // Verifying air pressure is between 0 and 1
        if (airPressure < 0) {
            this.airPressure = 0;
        } else if (airPressure > 1.0) {
            this.airPressure = 1.0;
        } else {
            this.airPressure = airPressure;
        }
    }
    
    public String getAirPressureStatus() { // Readings of pressure (general)
        if (airPressure >= 0.9) return "Fully Inflated";
        if (airPressure >= 0.7) return "Good";
        if (airPressure >= 0.5) return "Needs Some Air";
        if (airPressure >= 0.3) return "Very Low";
        return "Flat"; // if (airPressure < 0.3)
    }
    
    @Override // Orignal toString() function is being overwritten to a new style/formatting
    public String toString() {
        return String.format("Volleyball #%d (%s, %s, Air: %.1f - %s) - %s",
                ballId, color, condition, airPressure, getAirPressureStatus(),
                (isAvailable() ? "Available" : "Checked Out"));
    }
}

// Class to manage the Volleyballs
class InventoryManager {
    private ArrayList<Volleyball> volleyballs;
    private Scanner scanner;
    
    public InventoryManager() { // Constructor method
        volleyballs = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeSampleData();
    }
    
    private void initializeSampleData() { // Begin ArrayList with 4 Volleyball objects
        volleyballs.add(new Volleyball(1, "White", "Good", 0.9));
        volleyballs.add(new Volleyball(2, "Blue", "Fair", 0.6));
        volleyballs.add(new Volleyball(3, "Yellow", "Good", 0.3));
        volleyballs.add(new Volleyball(4, "White", "Poor", 0.7));
    }
    
    public void startProgram() {
        boolean running = true;
        
        while (running) { // While true, keep displaying the menu (knowledge gathered from CSE)
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    checkOutBall();
                    proceed();
                    break;
                case 2:
                    returnBall();
                    proceed();
                    break;
                case 3:
                    addNewBall();
                    proceed();
                    break;
                case 4:
                    viewInventory();
                    proceed();
                    break;
                case 5:
                    findMissingBalls();
                    proceed();
                    break;
                case 6:
                    checkAirPressure();
                    proceed();
                    break;
                case 7:
                    inflateBalls();
                    proceed();
                    break;
                case 8:
                    running = false;
                    System.out.println("Thank you for checking it out!   -A Small Kiwi-Sheep");
                    System.out.println(":D");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    proceed();
                

            }
        }
    }
    
    private void displayMenu() {
        System.out.println("\nVolleyball Inventory Management");
        System.out.println("1. Check out a volleyball");
        System.out.println("2. Return a volleyball");
        System.out.println("3. Add new volleyball to inventory");
        System.out.println("4. View current inventory");
        System.out.println("5. Find missing volleyballs");
        System.out.println("6. Check air pressure of volleyballs");
        System.out.println("7. Inflate volleyballs");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private void proceed() { // To help with the overwhelming of constant terminal's display
        System.out.print("Type anything, then [ENTER] to proceed: ");
        String uselessInput = scanner.next();
        uselessInput = "";
    }

    private void checkOutBall() { // Find Volleyball of id # and check out
        System.out.println("\nAvailable Volleyballs:");
        displayAvailableBalls();
        
        System.out.print("Enter the ID of the volleyball to check out (please be considerate of others): ");
        int id = scanner.nextInt();
        
        boolean found = false;
        for (Volleyball ball : volleyballs) { 
            if (ball.getBallId() == id && ball.isAvailable()) {
                if (ball.getAirPressure() < 0.5) { // Alert for checking out a ball of low pressure
                    System.out.println("Warning: This ball has low air pressure (" + 
                            ball.getAirPressureStatus() + "). Consider inflating it first.");
                }
                ball.setAvailable(false);
                System.out.println("Volleyball #" + id + " checked out successfully.");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Volleyball not found or already checked out.");
        }
    }
    
    private void returnBall() { // Give back a Volleyball of id #
        System.out.print("Enter the ID of the volleyball being returned: ");
        int id = scanner.nextInt();
        
        boolean found = false;
        for (Volleyball ball : volleyballs) {
            if (ball.getBallId() == id && !ball.isAvailable()) { // Making sure it's a valid Volleyball & checked out
                ball.setAvailable(true);
                
                System.out.print("Enter the condition of the returned ball (Good/Fair/Poor): "); // Give info on how you left it
                String condition = scanner.next();
                ball.setCondition(condition);

                ball.setAirPressure(ball.getAirPressure() - 0.2); // Volleyball loses air pressure "over time"
                
                System.out.println("Volleyball #" + id + " returned successfully.");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Volleyball not found or already returned.");
        }
    }
    
    private void addNewBall() { // Adding a new Volleyball to the system with a new id (not old), and 
        System.out.print("Enter new volleyball ID: ");
        int id = scanner.nextInt();
        for (Volleyball ball : volleyballs) {
            if (ball.getBallId() == id) {
                System.out.println("A volleyball has already been assigned this id.");
                return; // Though this is a void function, you can use return to break out of the method (hehe)
            }
        }
        scanner.nextLine(); // Consume new line
        
        // Setting new Volleyball info
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        
        System.out.print("Enter initial condition (Good/Fair/Poor): ");
        String condition = scanner.nextLine();
        
        System.out.print("Enter initial air pressure (0.0-1.0): ");
        double pressure = scanner.nextDouble();
        
        volleyballs.add(new Volleyball(id, color, condition, pressure));
        System.out.println("New volleyball added to inventory.");
    }
    
    private void viewInventory() { // Display current ArrayList of Volleyball objects
        System.out.println("\nCurrent Volleyball Inventory:");
        for (Volleyball ball : volleyballs) {
            System.out.println(ball.toString());
        }
    }
    
    private void displayAvailableBalls() { // Display current AVAILABLE Volleyball objects in ArrayList
        for (Volleyball ball : volleyballs) {
            if (ball.isAvailable()) {
                System.out.println(ball.toString());
            }
        }
    }
    
    private void findMissingBalls() {  // For any volleyball w/ potential id, 1 - highest one, see if any is taken out
        System.out.println("\nMissing Volleyballs:");
        boolean anyMissing = false;
        
        for (int i = 1; i <= getMaxId(); i++) { 
            boolean found = false;
            
            for (Volleyball ball : volleyballs) {
                if (ball.getBallId() == i) {
                    found = true;
                    if (!ball.isAvailable()) {
                        System.out.println("Volleyball #" + i + " is checked out and missing.");
                        anyMissing = true;
                    }
                    break;
                }
            }
            
            if (!found) { // If there are jumps in ids, report id's in between as not in list 
                System.out.println("Volleyball #" + i + " is not in inventory (or possibly lost).");
                anyMissing = true;
            }
        }
        
        if (!anyMissing) {
            System.out.println("No volleyballs are currently missing!");
        }
    }
    
    private void checkAirPressure() { // Display current air pressure of each Volleyball object
        System.out.println("\nVolleyball Air Pressure Status:");
        System.out.println("--------------------------------");
        
        for (Volleyball ball : volleyballs) {
            System.out.printf("#%d: %.1f - %s%n",
                    ball.getBallId(),
                    ball.getAirPressure(),
                    ball.getAirPressureStatus());
        }
        
        // Count how many need inflation
        int needInflation = 0;
        for (Volleyball ball : volleyballs) {
            if (ball.getAirPressure() < 0.7) {
                needInflation++;
            }
        }
        
        System.out.println("\n" + needInflation + " volleyball(s) need inflation (pressure < 0.7).");
    }
    
    private void inflateBalls() { // Inflate Volleyball(s) 
        System.out.println("\nInflate Volleyballs");
        System.out.println("1. Fully inflate all balls that need air");
        System.out.println("2. Inflate specific ball");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            // Inflate all balls with low pressure
            int inflatedCount = 0;
            for (Volleyball ball : volleyballs) {
                if (ball.getAirPressure() < 0.9) {
                    ball.setAirPressure(1.0); // Fully inflate
                    inflatedCount++;
                }
            }
            System.out.println(inflatedCount + " volleyball(s) inflated to full pressure.");
        } else if (choice == 2) {
            System.out.print("Enter ball ID to inflate: ");
            int id = scanner.nextInt();
            
            boolean found = false;
            for (Volleyball ball : volleyballs) { // Find Volleyball of id # and inflate
                if (ball.getBallId() == id) {
                    System.out.printf("Current pressure: %.1f (%s)%n", // Simplified from println -> printf
                            ball.getAirPressure(),
                            ball.getAirPressureStatus());
                    
                    System.out.print("Enter new pressure (0.0-1.0): ");
                    double newPressure = scanner.nextDouble();
                    ball.setAirPressure(newPressure);
                    
                    System.out.printf("Volleyball #%d now has pressure %.1f (%s)%n",
                            id,
                            ball.getAirPressure(),
                            ball.getAirPressureStatus());
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Volleyball not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
    
    private int getMaxId() { // Get the highest id in the ArrayList
        int max = 0;
        for (Volleyball ball : volleyballs) {
            if (ball.getBallId() > max) {
                max = ball.getBallId();
            }
        }
        return max;
    }
}