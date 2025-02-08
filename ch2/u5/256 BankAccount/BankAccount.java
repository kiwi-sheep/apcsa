// Assignment Name: '256 BankAccount'

public class BankAccount {
    // Instance Variables
    private String accountHolder;
    private int accountNumber; 
    private double balance;
    
    // Constructor Method!1!11!!!
    public BankAccount(String name, int account, double initialBalance) {
        this.accountHolder = name;
        this.accountNumber = account;
        this.balance = initialBalance;
    }
    
    // Getter method 1 for account holder name
    public String getName() {
        return accountHolder;
    }
    
    // Getter method 2 for account number
    public int getAccount() {
        return accountNumber;
    }
    
    // Getter method 3 for current balance
    public double getBalance() {
        return balance;
    }
    
    // Method to deposit da money
    public void deposit(double amount) {
        balance += amount; // never going to be over 10 dollars :sob: (joking)
    }
    
    // Method to withdraw money if there's enough
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount; // it's a withdraw, what did you expect? (talking to the voices in my head)
        } else {
            System.out.println("Cannot complete transaction. Insufficient funds."); // broke moment
        }
    }
    
    public static void main(String[] args) {
        // Creating the sample account
        BankAccount account = new BankAccount("Mr. Kong", 12345, 150.75);
        
        System.out.println("--"); // testing/formatting :D
        System.out.println("Account Holder: " + account.getName());
        System.out.println("Account Number: " + account.getAccount());
        System.out.println("Balance: $" + account.getBalance());
        
        System.out.println("--");
        System.out.println("This account belongs to " + account.getName());
        System.out.println("The account number is " + account.getAccount());
        System.out.println("Current Balance: $" + account.getBalance());
        
        System.out.println("--");
        System.out.println("Depositing $200");
        account.deposit(200);
        System.out.println("Current Balance: $" + account.getBalance());
        
        System.out.println("--");
        System.out.println("Withdrawing $400");
        account.withdraw(400);
        System.out.println("Current Balance: $" + account.getBalance());
        
        System.out.println("--");
        System.out.println("Withdrawing $350");
        account.withdraw(350);
        System.out.println("Current Balance: $" + account.getBalance());
        
        System.out.println("-----");
        System.out.println("\nAccount Holder: " + account.getName());
        System.out.println("Account Number: " + account.getAccount());
        System.out.println("Balance: $" + account.getBalance());
        // wish I could do something about how cramped it is
    }
}
