import java.util.*;

// Student class to store individual student information
class Student {
    private String name;
    private int studentID;
    private double grade;
    
    // Constructor
    public Student(String name, int studentID, double grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }
    
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getStudentID() { return studentID; }
    public void setStudentID(int studentID) { this.studentID = studentID; }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }
    
    // Display student details in a formatted string
    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Grade: %.1f", studentID, name, grade);
    }
}

// StudentManager class to handle all student-related operations
class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner;
    
    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    // Add a new student with input validation
    public void addStudent() {
        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter student ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            
            // Check if ID already exists
            if (findStudentById(id) != null) {
                System.out.println("Error: Student ID already exists!");
                return;
            }
            
            System.out.print("Enter student grade: ");
            double grade = Double.parseDouble(scanner.nextLine());
            
            // Validate grade range
            if (grade < 0 || grade > 100) {
                System.out.println("Error: Grade must be between 0 and 100!");
                return;
            }
            
            students.add(new Student(name, id, grade));
            System.out.println("Student added successfully!");
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values!");
        }
    }
    
    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    // Find student by ID
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentID() == id) {
                return student;
            }
        }
        return null;
    }
    
    // Remove student by ID
    public void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            Student student = findStudentById(id);
            
            if (student != null) {
                students.remove(student);
                System.out.println("Student removed successfully!");
            } else {
                System.out.println("Student not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid ID!");
        }
    }
    
    // Update student grade
    public void updateGrade() {
        System.out.print("Enter student ID to update grade: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            Student student = findStudentById(id);
            
            if (student != null) {
                System.out.print("Enter new grade: ");
                double newGrade = Double.parseDouble(scanner.nextLine());
                
                if (newGrade >= 0 && newGrade <= 100) {
                    student.setGrade(newGrade);
                    System.out.println("Grade updated successfully!");
                } else {
                    System.out.println("Error: Grade must be between 0 and 100!");
                }
            } else {
                System.out.println("Student not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values!");
        }
    }
    
    // Display menu and handle user input
    public void run() {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("Choose one of the following: ");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Update Student Grade");
            System.out.println("6. Exit");
            
            System.out.print("\nChoose an option: ");
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    displayAllStudents();
                    break;
                case "3":
                    System.out.print("Enter student ID to find: ");
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        Student student = findStudentById(id);
                        if (student != null) {
                            System.out.println(student);
                        } else {
                            System.out.println("Student not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter a valid ID!");
                    }
                    break;
                case "4":
                    removeStudent();
                    break;
                case "5":
                    updateGrade();
                    break;
                case "6":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}

// Main class to start the program
public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.run();
    }
}
