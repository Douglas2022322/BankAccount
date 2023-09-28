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
    public BankAccountManagement(double initialBbalance) {
        this.balance = initialBbalance;
    }

    public BankAccountManagement() {
        this.balance = 0;
    } 
    
    //Methods
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        if(amount <= balance){
            balance-=amount;
        }else{
            System.out.println("Insufficient founds.");
        }
    }
        
    //getter
    public double getBalance() {
        return balance;
    }
    
}
