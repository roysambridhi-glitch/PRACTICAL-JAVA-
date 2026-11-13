interface Bank {
    void display();
}

class Customer {
    int customer_id = 9109923;
    String name = "Titli";

    void showCustomer() {
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Customer Name: " + name);
    }
}

class Account extends Customer implements Bank {
    int account_no = 12345;
    double balance = 50000;

    public void display() {
        System.out.println("Account Number: " + account_no);
        System.out.println("Balance: " + balance);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Account a = new Account();

        a.showCustomer();
        a.display();
    }
} 
