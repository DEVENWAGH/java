class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Add a setter method to modify balance
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Current balance: " + account.getBalance());
        
        // Use setter method instead of direct field access
        account.setBalance(1500.0);
        System.out.println("Updated balance: " + account.getBalance());
    }
}