
// BankAccount.java

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                overdraftLimit += newBalance; // reduce overdraft limit
            }
            super.deposit(-amount); // subtracting amount
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded or invalid withdrawal amount");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", "John Doe", 1000.0, 5.0);
        savingsAccount.deposit(500);
        savingsAccount.addInterest();
        savingsAccount.displayBalance();
        savingsAccount.withdraw(200);
        savingsAccount.displayBalance();

        // Create a Current Account
        CurrentAccount currentAccount = new CurrentAccount("CA54321", "Jane Doe", 2000.0, 500.0);
        currentAccount.deposit(300);
        currentAccount.displayBalance();
        currentAccount.withdraw(2500);
        currentAccount.displayBalance();
        currentAccount.withdraw(200); // This should exceed the overdraft limit
    }
}
