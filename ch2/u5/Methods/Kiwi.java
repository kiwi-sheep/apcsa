public class Kiwi {
    // Instance variables
    private double weight;
    private String ripeness;
    private boolean isFuzzy;
    private double price;

    // Constructor using 'this'
    public Kiwi(double weight, String ripeness, boolean isFuzzy, double price) {
        this.weight = weight;
        this.ripeness = ripeness;
        this.isFuzzy = isFuzzy;
        this.price = price;
    }

    // Accessor methods (getters)
    public double getWeight() {
        return weight;
    }

    public String getRipeness() {
        return ripeness;
    }

    public boolean getIsFuzzy() {
        return isFuzzy;
    }

    public double getPrice() {
        return price;
    }

    
    // Mutator methods ('setting' methods)
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive");
        }
    }

    public void setRipeness(String ripeness) {
        if (ripeness.equals("unripe") || ripeness.equals("ripe") || ripeness.equals("overripe")) {
            this.ripeness = ripeness;
        } else {
            System.out.println("Invalid ripeness state");
        }
    }

    public void setIsFuzzy(boolean isFuzzy) {
        this.isFuzzy = isFuzzy;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative");
        }
    }

    // Method showing boolean return type = returns a boolean value
    public boolean isReadyToEat() {
        return this.ripeness.equals("ripe");
    }

    // Method showing void return type = no return value BUT in this case allows for print statements
    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            this.price = this.price * (1 - discountPercent/100);
            System.out.println("New price after " + discountPercent + "% discount: $" + this.price);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a new kiwi
        Kiwi kiwi = new Kiwi(0.15, "unripe", true, 0.99);

        // Using accessor methods
        System.out.println("Kiwi Weight (kg): " + kiwi.getWeight());
        System.out.println("Ripeness State: " + kiwi.getRipeness());
        System.out.println("Is Fuzzy: " + kiwi.getIsFuzzy());
        System.out.println("Price: $" + kiwi.getPrice());

        // Using mutator methods
        kiwi.setRipeness("ripe");
        kiwi.setPrice(1.29);
        kiwi.setWeight(0.18);

        // Using other methods
        System.out.println("Is Ready to Eat? " + kiwi.isReadyToEat());
        kiwi.applyDiscount(20);
    }
}
