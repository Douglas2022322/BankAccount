/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author dougl
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BankAccountManagement account1 = new BankAccountManagement(100);
        
        System.out.println(account1.getBalance());
        
        account1.deposit(50);
        
        account1.withdraw(25.50);
        
        System.out.println(account1.getBalance());
        
    }
    
}
