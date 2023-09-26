import java.util.*;
import java.io.*;

public class AdminMenu extends Menu {
  
  public void addUser(Scanner input, ArrayList<User> user){
    
    boolean userExists = true;
    while(userExists){
      boolean isEqual = false;

      System.out.println("Enter a New Account Number for New User: ");
      int accountNumber = input.nextInt();
      
      if(accountNumber == 0){ 
        isEqual = true;}
     
      for(int i=0; i < user.size(); i++){
        if(user.get(i).getAccountNumber() == accountNumber){
          isEqual = true;}
 
      } 
   
      if(isEqual) {
        System.out.println("Account Number already in use");
        userExists = true;}
      
      else{
        System.out.println("Enter a PIN for New User: ");
        int pin = input.nextInt();

        user.add(new User(accountNumber, pin, new Account(0), new Account(0)));
        System.out.println("User added."); 
        userExists = false;}
    }
      
  }

  public void deleteUser(Scanner input, ArrayList<User> user){
    System.out.println("Enter the Account Number of the User you want to delete");
    int accNumber = input.nextInt();
    System.out.println("Enter the PIN of the User you want to delete");
    int accPIN = input.nextInt();
    boolean userMissing = true;
    for(int i=0; i < user.size(); i++){
      if(user.get(i).getAccountNumber() == accNumber && user.get(i).getPIN() == accPIN){
        userMissing = false;
        if(user.get(i).getCheckings().getBalance() == 0 && user.get(i).getSavings().getBalance() == 0){
          user.remove(i);
          System.out.println("User removed.");}
        else {
          System.out.println("Unable to remove User (User Account balances must be empty to remove)");}
      }
    }
    if(userMissing){
      System.out.println("User Not Found");}
  }  
      
             
      
  public void listUsers(ArrayList<User> user){
    for(int i=0; i < user.size(); i++){
       System.out.println("Account Number: " + user.get(i).getAccountNumber());
       System.out.println("PIN: " + user.get(i).getPIN());
       System.out.println("----------------------");
    }
  }

  public void interest(Scanner input, ArrayList<User> user){
    System.out.println("Enter a interest rate between 0 and 1 in decimal: ");
    double rate = input.nextDouble();
    System.out.println("Enter number of months you wish to apply interest for: ");
    double months = input.nextDouble();
    for(int i=0; i < user.size(); i++){
      user.get(i).getSavings().applyInterest(rate, months);}
    System.out.println("Interest Applied to All Savings Accounts");
  }

  public void getCheckingsBalance(int accountNumber, int pin, ArrayList<User> user){}

  public void depositCheckings(Scanner input, int accountNumber, int pin, ArrayList<User> user){}

  public void withdrawCheckings(Scanner input, int accountNumber, int pin, ArrayList<User> user){}

  public void getSavingsBalance(int accountNumber, int pin, ArrayList<User> user){}

  public void depositSavings(Scanner input, int accountNumber, int pin, ArrayList<User> user){}

  public void withdrawSavings(Scanner input, int accountNumber, int pin, ArrayList<User> user){}

}
