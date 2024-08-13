package corejava;
import java.util.*;
class Banks {
    String accountNumber;
    String accountHolderName;
    double balance;
    Banks(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = name;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("After Deposit: " + balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("After Withdraw: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
    }
}
public class bank {
    private List<Banks> accounts = new ArrayList<>();
    void addAccount(Banks bankAccount) {
        accounts.add(bankAccount);
        System.out.println("Account added successfully.");
    }
    void removeAccount(String accountNumber) {
        for (Banks account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account removed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }
    void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }
        for (Banks account : accounts) {
            account.display();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        bank bank = new bank();
        Banks account1 = new Banks("12345678", "DK", 700000.0);
        Banks account2 = new Banks("87654321", "Alex", 500000.0);
        bank.addAccount(account1);
        bank.addAccount(account2);
        System.out.println("\nAll Accounts");
        bank.displayAllAccounts();
        System.out.println("--------------------------------" + "\nPerforming operations on account 12345678:");
        account1.deposit(20000);
        account1.withdraw(50000);
        bank.removeAccount("12345678");
        System.out.println("--------------------------------" + "\nAccount after removal");
        bank.displayAllAccounts();
    }
}
