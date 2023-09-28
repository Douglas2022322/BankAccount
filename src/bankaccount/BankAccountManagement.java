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
    
//Constructors
    public BankAccountManagement(double balance) {
        this.balance = balance;
    }

    public BankAccountManagement() {
        this.balance = 0;
    } 
        
    //getters and setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
}
