// Assignment Name: 'Activity 3.7.4 Traversing ArraysLists'
import java.util.ArrayList;

public class Traversing {
    static class Person {  
        private String name;
        private String age;
        
        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = String.valueOf(age);
        }
        
        public String toString() { // If we do ...print(person), we'll get this
            return "Name: " + name + ", Age: "+ age;
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Avri", 25));
        people.add(new Person("Alan", 30));
        people.add(new Person("Bob", 22));
        people.add(new Person("Evan", 40));
        people.add(new Person("Charlie", 35));
        
        // Traverse using a standard for loop and print details
        System.out.println("---");
        System.out.println("Using standard for loop:");
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            System.out.println(person);
        }

        // Traverse using an enhanced for loop and calculate the average age
        System.out.println("---");
        System.out.println("Using enhanced for loop:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Calculate the average age
        System.out.println("---");
        System.out.println("Calculating average age:");
        int sum = 0;
        for (Person person : people) {
            sum += Integer.parseInt(person.age); // parseInt because we have a String value from our Person class that we want to convert into an int
        }
        double average = (double) sum / people.size();
        System.out.printf("Average age: %.2f%n", average); // Prints; "Average age: " + average, but to two decimal places
        
        // Traverse and find the oldest/youngest
        System.out.println("---");
        System.out.println("Finding oldest and youngest people:");
        Person oldest = people.get(0);
        Person youngest = people.get(0);
        
        for (Person person : people) {
            if (Integer.parseInt(person.age) > Integer.parseInt(oldest.age)) { // If current person's age is greater than the oldest...
                oldest = person;
            }
            if (Integer.parseInt(person.age) < Integer.parseInt(youngest.age)) { // If current person's age is less than the oldest...
                youngest = person;
            }
        }
        System.out.println("Oldest: " + oldest);
        System.out.println("Youngest: " + youngest);
    }
}