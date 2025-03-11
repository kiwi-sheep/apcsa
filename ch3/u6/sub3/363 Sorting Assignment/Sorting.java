// Assignment Name: '6.3 Sorting'

public class Sorting {
   public static void main(String[] args) {
      // Given arrays
      String[] maleFirstNames = {
         "Aaron", "Abel", "Adam", "Adrian", "Aidan", "Alex", "Alfred", "Amos",
         "Andrew", "Angelo",
         "Anthony", "Arthur", "Asher", "Austin", "Ben", "Benjamin", "Blake",
         "Bobby", "Brad", "Brandon",
         "Brendan", "Brett", "Brian", "Bruce", "Bryan", "Caleb", "Carl",
         "Carlos", "Carter", "Chad",
         "Charles", "Charlie", "Chris", "Christian", "Christopher", "Clayton",
         "Cody", "Colin", "Connor",
         "Craig", "Daniel", "David", "Dean", "Dennis", "Derek", "Dominic",
         "Don", "Donald", "Douglas",
         "Dylan", "Eddie", "Edward", "Elijah", "Elliot", "Emmett", "Eric",
         "Ethan", "Evan", "Felix",
         "Francis", "Freddie", "Gabriel", "Gage", "Garrett", "George", "Gordon",
         "Greg", "Gregory", "Harry",
         "Harrison", "Henry", "Hunter", "Ian", "Isaac", "Jack", "Jacob",
         "James", "Jason", "Jeffrey",
         "Jeremy", "Jesse", "John", "Johnny", "Jordan", "Joseph", "Joshua",
         "Juan", "Julian", "Justin",
         "Keith", "Kenneth", "Kevin", "Kyle", "Liam", "Logan", "Lucas", "Luis",
         "Luke", "Malcolm",
         "Mark", "Martin", "Matthew", "Max", "Michael", "Micheal", "Miles",
         "Nathan", "Nathaniel", "Neil",
         "Nicholas", "Noah", "Oliver", "Oscar", "Owen", "Patrick", "Paul",
         "Peter", "Philip", "Ralph",
         "Raymond", "Reed", "Richard", "Robert", "Rodney", "Roger", "Ronald",
         "Rory", "Roy", "Ryan",
         "Samuel", "Scott", "Sean", "Seth", "Shane", "Simon", "Stephen",
         "Steve", "Teddy", "Thomas",
         "Timothy", "Todd", "Tony", "Travis", "Trevor", "Tristan", "Tyler",
         "Victor", "Vincent", "Wade",
         "Walter", "Wayne", "William", "Zachary"
      };
         String[] femaleFirstNames = {
         "Abigail", "Adeline", "Aileen", "Alana", "Alexa", "Alice", "Alicia",
         "Amelia", "Ana", "Angela",
         "Anna", "Ariana", "Aubrey", "Audrey", "Ava", "Bella", "Bianca",
         "Brianna", "Brooke", "Camila",
         "Carla", "Carmen", "Charlotte", "Chloe", "Clara", "Cleo", "Daisy",
         "Dana", "Danielle", "Diana",
         "Donna", "Ella", "Emily", "Emma", "Eva", "Faith", "Fiona", "Gabriella",
         "Georgia", "Grace",
         "Hannah", "Harper", "Hazel", "Helen", "Iris", "Isabella", "Isla",
         "Jade", "Jasmine", "Jessica",
         "Joan", "Jordan", "Julia", "Kaitlyn", "Katherine", "Kayla", "Kimberly",
         "Kylie", "Lana", "Laura",
         "Layla", "Leah", "Lillian", "Lily", "Lucy", "Luna", "Maggie",
         "Makayla", "Maria", "Maya",
         "Melanie", "Mia", "Mikayla", "Mila", "Natalie", "Nicole", "Olivia",
         "Paige", "Peyton", "Rachel",
         "Rebecca", "Riley", "Rose", "Samantha", "Sarah", "Savannah", "Sophia",
         "Stella", "Summer", "Sydney",
         "Taylor", "Tessa", "Victoria", "Violet", "Willow", "Zoe", "Avery",
         "Sophie", "Lauren", "Megan",
         "Eliza", "Sierra", "Scarlett", "Eleanor", "Kendra", "Nina", "Caitlyn",
         "Jenna", "Maya", "Charlotte",
         "Morgan", "Alexis", "Renee", "Kimberly", "Isabel", "Audrina",
         "Lindsay", "Kaitlin", "Maya", "Alicia"
      };
      String[] maleGradeLevel = {
         "10th", "11th", "12th", "10th", "11th", "12th", "12th", "10th",
         "11th", "12th",
         "11th", "12th", "10th", "10th", "12th", "11th", "12th", "10th",
         "11th", "12th",
         "12th", "11th", "10th", "12th", "10th", "12th", "11th", "10th",
         "12th", "11th",
         "10th", "11th", "12th", "10th", "12th", "11th", "10th", "12th",
         "11th", "10th",
         "12th", "12th", "11th", "12th", "10th", "11th", "10th", "12th",
         "11th", "10th",
         "12th", "10th", "11th", "12th", "12th", "10th", "12th", "11th",
         "10th", "12th",
         "10th", "11th", "12th", "12th", "10th", "11th", "10th", "12th",
         "12th", "11th",
         "10th", "12th", "11th", "10th", "12th", "10th", "12th", "11th",
         "12th", "11th",
         "10th", "12th", "11th", "12th", "10th", "12th", "11th", "10th",
         "11th", "12th",
         "12th", "10th", "12th", "11th", "12th", "10th", "11th", "10th",
         "12th", "11th",
         "12th", "10th", "11th", "12th", "10th", "12th", "11th", "12th",
         "11th", "12th",
         "10th", "11th", "12th", "12th", "10th", "11th", "10th", "12th",
         "10th", "11th",
         "12th", "11th", "10th", "12th", "10th", "11th", "12th",
         "12th", "10th", "11th",
         "10th", "10th", "12th", "11th", "12th", "10th", "11th", "12th",
         "12th", "11th",
         "10th", "11th", "12th", "12th", "10th", "11th", "10th", "12th",
         "12th", "10th",
         "10th", "10th", "11th"
      };
      String[] femGradeLevel = {
         "10th", "12th", "11th", "10th", "11th", "12th", "12th", "11th",
         "12th", "10th",
         "10th", "11th", "12th", "12th", "10th", "11th", "10th", "12th",
         "10th", "11th",
         "12th", "12th", "11th", "10th", "10th", "12th", "11th", "10th",
         "12th", "10th",
         "11th", "12th", "12th", "10th", "11th", "10th", "11th", "12th",
         "12th", "10th",
         "11th", "12th", "10th", "11th", "12th", "12th", "10th", "11th",
         "12th", "10th",
         "11th", "12th", "10th", "12th", "10th", "11th", "10th", "11th",
         "12th", "10th",
         "12th", "11th", "10th", "12th", "10th", "12th", "11th", "10th",
         "12th", "11th",
         "10th", "11th", "12th", "10th", "12th", "11th", "10th", "12th",
         "11th", "10th",
         "12th", "10th", "12th", "11th", "12th", "10th", "11th", "10th",
         "12th", "11th",
         "12th", "10th", "11th", "12th", "10th", "12th", "11th", "12th",
         "11th", "12th",
         "10th", "11th", "12th", "10th", "12th", "11th", "10th", "12th",
         "11th", "10th",
         "12th", "12th", "11th", "12th", "10th", "11th", "10th", "12th",
         "11th", "10th"
      };
      Double[] maleGPA = {
         1.94, 2.41, 3.14, 4.11, 3.58, 1.92, 3.46, 3.71, 2.87, 3.39,
         4.31, 3.08, 2.61, 3.99, 3.02, 3.21, 4.32, 1.58, 3.82, 4.16,
         3.23, 4.28, 2.74, 3.47, 3.69, 2.96, 2.04, 1.81, 3.52, 3.77,
         4.35, 4.09, 2.21, 2.47, 2.73, 1.91, 3.38, 3.14, 3.11, 4.33,
         2.55, 1.69, 2.10, 1.60, 2.95, 3.64, 3.04, 1.51, 4.39, 2.36,
         2.77, 2.43, 3.93, 2.12, 3.33, 2.68, 2.58, 3.74, 3.85, 1.90,
         4.24, 2.80, 1.65, 3.26, 3.22, 3.01, 3.67, 1.70, 4.12, 3.16,
         1.55, 2.22, 3.79, 2.18, 2.33, 3.48, 2.16, 3.13, 3.20, 4.18,
         2.26, 1.84, 2.91, 4.23, 1.56, 3.19, 3.53, 4.00, 2.27, 4.44,
         2.30, 1.74, 2.23, 3.62, 4.14, 2.89, 2.59, 3.72, 4.21, 3.78,
         2.85, 4.27, 3.87, 2.50, 3.40, 3.28, 2.29, 3.06, 3.41, 1.74,
         3.59, 2.57, 1.63, 3.02, 3.15, 1.99, 3.07, 2.38, 4.43, 2.93,
         4.19, 3.01, 3.14, 3.50, 4.25, 2.68, 3.49, 2.84, 4.22, 4.11,
         1.16, 2.66, 1.55, 3.66, 2.42, 4.35, 2.31, 4.19, 3.05, 3.04,
         3.58, 4.35, 2.77, 3.44, 2.94, 4.00, 4.21, 2.83, 1.86, 2.81,
         3.99, 2.89, 4.22
      };
      Double[] femGPA = {
         1.79, 3.81, 4.08, 2.60, 4.11, 3.76, 1.62, 2.54, 3.56, 2.62,
         3.36, 4.00, 3.09, 3.09, 3.25, 2.94, 4.51, 4.40, 1.70, 3.68,
         3.30, 3.73, 1.79, 4.15, 4.38, 2.64, 2.56, 2.41, 1.76, 2.65,
         1.75, 3.60, 2.42, 4.35, 2.31, 4.19, 3.05, 3.04, 3.50, 4.25,
         2.78, 3.49, 2.74, 4.02, 4.31, 2.83, 1.82, 2.81, 3.31, 1.83,
         2.84, 3.17, 2.99, 3.44, 3.37, 2.80, 2.39, 2.94, 3.70, 1.90,
         3.45, 4.07, 2.88, 1.78, 4.28, 3.66, 4.13, 3.32, 1.91, 4.22,
         3.46, 3.71, 2.87, 3.39, 4.31, 3.08, 2.61, 3.99, 3.02, 3.21,
         4.32, 1.58, 3.82, 4.16, 3.23, 4.28, 2.74, 3.47, 3.69, 2.96,
         2.04, 1.89, 3.92, 3.79, 4.55, 4.59, 2.25, 2.45, 2.75, 1.95,
         3.98, 2.31, 3.19, 3.62, 3.81, 4.82, 1.98, 3.52, 4.36, 3.93,
         4.23, 2.64, 3.42, 3.67, 2.97, 2.24, 1.21, 3.22, 3.72, 4.33
      };
      
      // Create arrays for student data
      Student[] students = new Student[200];  // Array to hold both male and female students
      int index = 0;
      
      // Add first 100 male students
      for (String name : maleFirstNames) {
         if (index >= 100) break;
         // Extract just the number from the grade level string (remove "th")
         int grade = Integer.parseInt(maleGradeLevel[index].replace("th", "")); // Integer.parseInt() converts the string "10" to the number 10
         
         // Create new Student object and store it in array
         students[index] = new Student(name, grade, "Male", maleGPA[index]);
         index++;
      }
      
      // Add first 100 female students
      int femaleIndex = 0;
      for (String name : femaleFirstNames) {
         if (femaleIndex >= 100) break;
         int grade = Integer.parseInt(femGradeLevel[femaleIndex].replace("th", ""));
         students[index] = new Student(name, grade, "Female", femGPA[femaleIndex]);
         index++;
         femaleIndex++;
      }
      
      // Sort by GPA (selection sort)
      for (int i = 0; i < students.length - 1; i++) {
         int maxIndex = i;
         for (int j = i + 1; j < students.length; j++) {
            if (students[j].getGPA() > students[maxIndex].getGPA()) {
               maxIndex = j;
            }
         }
         // Swap current position with highest GPA found
         Student temp = students[i];
         students[i] = students[maxIndex];
         students[maxIndex] = temp;
      }
      
      // Print formatted header for neat-o output :P
      System.out.println("Student Information (Sorted by GPA):");
      System.out.println("Name\t\tGrade\tGender\tGPA\tStatus");
      System.out.println("------------------------------------------------");
      
      // Print all students using for-each
      for (Student student : students) {
         String status = (student.getGPA() < 2.0) ? "ON ACADEMIC PROBATION" : ""; // shorthand if-else statement --> condition ? valueIfTrue : valueIfFalse

         // %-12s: left-aligned string of width 12
         // %d: integer
         // %s: string
         // %.2f: float with 2 decimal places
         // %n: newline
         System.out.printf("%-12s\t%d\t%s\t%.2f\t%s%n", 
            student.getName(),
            student.getGradeLevel(),
            student.getGender(),
            student.getGPA(),
            status);
      }
   }
}

class Student {
   private String name;
   private int gradeLevel;
   private String gender;
   private double gpa;
   
   public Student(String name, int gradeLevel, String gender, double gpa) {
      this.name = name;
      this.gradeLevel = gradeLevel;
      this.gender = gender;
      this.gpa = gpa;
   }
   
   // Getters
   public String getName() { return name; }
   public int getGradeLevel() { return gradeLevel; }
   public String getGender() { return gender; }
   public double getGPA() { return gpa; }
}
