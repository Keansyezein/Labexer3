
package labexer3;
import java.util.Scanner;
public class RunSavingsAccount {

  
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter Interest Rate:");
        savings.setInterest(inp.nextDouble());
        
        System.out.print("Enter an amount to deposit: P");
        savings.deposit(inp.nextDouble());
        
        System.out.println("Your balance is " + savings.getBalance()); 
        
        
        System.out.println("Type d if you want to deposit again, type w for withdraw");
        inp.nextLine();
        String input = inp.nextLine();
        
        if(input.equalsIgnoreCase("d")){
            System.out.print("Enter an amount to deposit: P");
            savings.deposit(inp.nextDouble());
            System.out.println("Your new balance is " + savings.getBalance()); 
        }
        else if (input.equalsIgnoreCase("w")){
            System.out.print("Enter an amount to withdraw: P");
            savings.Withdraw(inp.nextDouble());
            System.out.println("Your new balance is " + savings.getBalance()); 
            
        }
        else{
            System.out.println("Invalid!");
        }
        
        if(savings.getBalance() > 1000){
            System.out.println("Interest Applied!");
            savings.addInterest();
            System.out.println("Your new balance now is " + savings.getBalance());
        }
        
    }
    
}

class SavingsAccount{
    private double balance;
    public static double interestrate = 0;
    
    public void setInterest(Double newrate){
        interestrate = newrate;
    }
    
    public static Double getInterestRate(){
        return interestrate;
    }
    
    public Double getBalance(){
        return balance;
    }
    
    public void deposit(Double amount){
        balance += amount;
    }
    
    public Double Withdraw(Double amount){
      if(balance >= amount){
          balance -= amount;
          return amount;
      }  
      else{
          return 0.0;
      }
    }
    
    public void addInterest(){
    Double Interest = balance * getInterestRate();
    balance += Interest;
}
    
    public void showBalance(SavingsAccount account){
        getBalance();
    }
    
    
    
}
