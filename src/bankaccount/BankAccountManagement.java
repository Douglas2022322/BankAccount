/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;

/**
 *
 * @author dougl
 */
public class BankAccountManagement {

    //variables
    private double balance;
    private int accountNumber;

//Constructors
    public BankAccountManagement(int accountNumber, double initialBbalance) {
        this.balance = initialBbalance;
        this.accountNumber = accountNumber;
    }

    public BankAccountManagement(int accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    //Methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient founds.");
        }
    }

    //getter
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
