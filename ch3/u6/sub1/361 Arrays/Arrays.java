// Assignment Name: 'Activity 3.6.1 - Arrays'

public class Arrays {
	public static void main(String[] args) {
        // Create parallel arrays for cities, temperatures, and precipitation
        String[] cities = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] temperatures = {104, 73, 80};
        double[] precipitation = {4.17, 26.7, 55.0};

        // Print the table of information
		System.err.println("---\nPrinting data table:");
		DisplayTable(cities, temperatures, precipitation);

        // Test getLastElement method
        System.out.println("---\nThe last element of the String array is: ");
        getLastElement(cities);

        // Test printArray method
        System.out.println("---\nPrinting all cities:");
        printArray(cities);
    }
	// Seperate method for displaying a whole brick wall of text
	public static void DisplayTable(String[] cities, int[] temps, double[] precipitation) {
		for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + " has an average annual precipitation of " + precipitation[i] + " inches.");
            System.out.println(cities[i] + " has an average annual high temp of " + temps[i] + " degrees Fahrenheit.");
        }
	}
    // Method to get the last element of an array
    public static void getLastElement(String[] arr) {
        System.out.println(arr[arr.length - 1]); // big brain :P
    }
    // Method to print all elements of a String array
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Item " + (i + 1) + ": " + arr[i]); // add one to index value to account for index 0
        }
    }
}
