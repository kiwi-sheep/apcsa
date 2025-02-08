// Assignment Name: '256 Cars'

class Car {
    private double efficiency; // miles per gallon (mpg)
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;

    public Car(double carEfficiency, double carTankCapacity) {
        efficiency = carEfficiency; // argument from the called function
        tankCapacity = carTankCapacity; // ^^^ same here
        gas = 0; // none to begin with
        totalMilesDriven = 0; // none to begin with
    }

    public void addGas() {
        System.out.println("Filling up ...");
        gas = tankCapacity; // fill til full
    }

    public void addGas(double amount) {
        System.out.println("Adding gas ...");
        if (gas + amount > tankCapacity) { 
            gas = tankCapacity;
        } else {
            gas += amount;
        }
    }

    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }

    public void drive(double distance) {
        if (canDrive(distance)) {
            System.out.println("Driving " + distance);
            totalMilesDriven += distance;
            gas -= distance / efficiency;
        } else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }

    public boolean canDrive(double distance) {
        return distance <= milesAvailable();
    }

    public double milesAvailable() {
        return gas * efficiency;
    }

    public double getGas() {
        return gas;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(20.0, 15.0); // 20 efficiency (mpg), 15 gallon tank
        
        System.out.println("--"); // Meant to seperate in chucks for testing, but I guess I'll keep it
        car.addGas(); // Fill up the tank
        System.out.println("Miles available: " + car.milesAvailable());
        
        System.out.println("--");
        car.drive(100.0);
        System.out.println("Miles available: " + car.milesAvailable());
        
        System.out.println("--");
        car.addGas(3.0);
        System.out.println("Miles available: " + car.milesAvailable());
        
        System.out.println("--");
        car.drive(1000.0);
        car.drive(200.0);
        
        System.out.println("-----");
        System.out.println("Gas remaining: " + car.getGas());
        System.out.println("Total Miles Driven: " + car.getTotalMilesDriven());
    }
}
