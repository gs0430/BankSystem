import java.util.*;
import java.io.*;

public class UserMenu extends Menu {

  public void getCheckingsBalance(int accountNumber, int pin, ArrayList<User> user){
    System.out.println("Checkings Balance: ");
    for(int i=0; i < user.size(); i++){
      if(user.get(i).getAccountNumber() == accountNumber && user.get(i).getPIN() == pin){
        double checkingsBalance = user.get(i).getCheckings().getBalance();
        System.out.println(checkingsBalance);}
    }
  }

  public void depositCheckings(Scanner input, int accountNumber, int pin, ArrayList<User> user){
    System.out.println("How much do you wish to deposit in your Checkings Account: ");
    double amount = input.nextDouble();
    for(int i=0; i < user.size(); i++){
      if(user.get(i).getAccountNumber() == accountNumber && user.get(i).getPIN() == pin){
        user.get(i).getCheckings().deposit(amount);
      }
    }
  }

  public void withdrawCheckings(Scanner input, int accountNumber, int pin, ArrayList<User> user){
    System.out.println("How much do you wish to withdraw from your Checkings Account: ");
    double amount = input.nextDouble(); 
    for(int i=0; i < user.size(); i++){
      if(user.get(i).getAccountNumber() == accountNumber && user.get(i).getPIN() == pin){
        user.get(i).getCheckings().withdraw(amount);
      }
    }
  } 

  public void getSavingsBalance(int accountNumber, int pin, ArrayList<User> user){
    System.out.println("Savings Balance: ");
    for(int i=0; i < user.size(); i++){
      if(user.get(i).getAccountNumber() == accountNumber && user.get(i).getPIN() == pin){
        double savingsBalance = user.get(i).getSavings().getBalance();
        System.out.println(savingsBalance);}
    }
  }

  public void depositSavings(Scanner input, int accountNumber, int pin, ArrayList<User> user){
    System.out.println("How much do you wish to deposit in your Savings Account: ");
    double amount = input.nextDouble();
    for(int i=0; i < user.size(); i++){
      if(user.get(i).getAccountNumber() == accountNumber && user.get(i).getPIN() == pin){ 
        user.get(i).getSavings().deposit(amount);
      }
    }
  }

  public void withdrawSavings(Scanner input, int accountNumber, int pin, ArrayList<User> user){
    System.out.println("How much do you wish to withdraw from your Savings Account: ");
    double amount = input.nextDouble();
    for(int i=0; i < user.size(); i++){
      if(user.get(i).getAccountNumber() == accountNumber && user.get(i).getPIN() == pin){
        user.get(i).getSavings().withdraw(amount);
      }
    }
  }  
  
  public void addUser(Scanner input, ArrayList<User> user){}

  public void deleteUser(Scanner input, ArrayList<User> user){}

  public void listUsers(ArrayList<User> user){}

  public void interest(Scanner input, ArrayList<User> user){}

}  
