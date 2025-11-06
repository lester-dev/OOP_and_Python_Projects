// BankAccount class with encapsulation
class BankAccount {
    private double __balance;  // Private balance variable

    // Constructor to initialize the balance
    BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.__balance = initialBalance;
        } else {
            this.__balance = 0;  // Set balance to 0 if initial balance is negative
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            __balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= __balance) {
            __balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return __balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Initial balance of 1000
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current balance: " + account.getBalance());  // Output: Current balance: 1300.0
    }
}
