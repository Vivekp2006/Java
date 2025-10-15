package scann;
import java.util.Scanner;

class BankAcco {
    private String holder;
    private String number;
    private double balance;

    public BankAcco(String holder, String number, double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public void showDetails() {
        System.out.println("Holder Name: " + holder);
        System.out.println("Account Number: " + number);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAcco account = new BankAcco("Chinmay Prakash Raut", "2024250703", 10);

        System.out.println("Initial account details:");
        account.showDetails();

        System.out.println("Enter amount to deposit:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Updated account details:");
        account.showDetails();

        scanner.close();
    }
}
