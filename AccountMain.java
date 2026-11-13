
abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName, address;

    abstract void withdrawl(double amount);

    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest = 5;

    void withdrawl(double amount) {
        balance = balance - amount;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + (balance + interest));
    }
}

public class AccountMain {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.accountNumber = 2351;
        s.accountHoldersName = "Rupshida";
        s.address = "Kolkata";
        s.balance = 10000;

        s.deposit(2000);
        s.withdrawl(1000);

        s.display();
        s.calculateAmount();
    }
}
