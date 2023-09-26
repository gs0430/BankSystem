import java.util.*;
import java.io.*;

public class Main {
  
  public static void main(String [] args){

    ArrayList<User> user = new ArrayList<User>();
    AdminMenu adminMenu = new AdminMenu();
    UserMenu userMenu = new UserMenu();
    Scanner input = new Scanner(System.in);

    login(input, user, adminMenu, userMenu);
  }

  public static void login(Scanner input, ArrayList<User> user, AdminMenu adminMenu, UserMenu userMenu){
    System.out.println("Enter Account Number: ");
    
    int accountNumber = input.nextInt();
    System.out.println("Enter your PIN: ");
    
    int pin = input.nextInt();
      
    if(accountNumber == 00000 && pin == 12345){
      admin(input, user, adminMenu, userMenu);}

    for(int i = 0; i < user.size(); i++){
      if(user.get(i).getAccountNumber() == accountNumber && user.get(i).getPIN() == pin){
        customer(input, user, adminMenu, userMenu, accountNumber, pin);}
        
    }
   
  } 
       
  public static void admin(Scanner input, ArrayList<User> user, AdminMenu adminMenu, UserMenu userMenu){
   
    System.out.println("---------------------------------------------------");

    System.out.println("Admin Menu: ");
    System.out.println("Type the Corresponding Number for the Option you wish to choose");
    System.out.println("1) Add a User");
    System.out.println("2) Delete a User");
    System.out.println("3) List All Users");
    System.out.println("4) Apply Interest to All Savings Accounts");
    System.out.println("5) Exit");
      
    int adminMenuChoice = input.nextInt();
        
    if(adminMenuChoice == 1){
      System.out.println("---------------------------------------------------");
      adminMenu.addUser(input, user);
      admin(input, user, adminMenu, userMenu);}
      
    if(adminMenuChoice == 2){
      System.out.println("---------------------------------------------------");    
      adminMenu.deleteUser(input, user);
      admin(input, user, adminMenu, userMenu);}
 
    if(adminMenuChoice == 3){
      System.out.println("---------------------------------------------------");
      adminMenu.listUsers(user);
      admin(input, user, adminMenu, userMenu);}
 
    if(adminMenuChoice == 4){ 
      System.out.println("---------------------------------------------------");
      adminMenu.interest(input, user);
      admin(input, user, adminMenu, userMenu);}
 
    if(adminMenuChoice == 5){
      System.out.println("---------------------------------------------------");
      login(input, user, adminMenu, userMenu);}
  
  }  
  public static void customer(Scanner input, ArrayList<User> user, AdminMenu adminMenu, UserMenu userMenu, int accountNumber, int pin){

    System.out.println("---------------------------------------------------");

    System.out.println("Customer Menu: ");
    System.out.println("Type the Corresponding Number for the Option you wish to choose");
    System.out.println("1) Get Checkings Balance");
    System.out.println("2) Deposit into Checkings");
    System.out.println("3) Withdraw from Checkings");
    System.out.println("4) Get Savings Balance");
    System.out.println("5) Deposit into Savings");
    System.out.println("6) Withdraw from Savings");
    System.out.println("7) Exit");
    
 
    int userMenuChoice = input.nextInt();
   
    if(userMenuChoice == 1){
      System.out.println("---------------------------------------------------");    
      userMenu.getCheckingsBalance(accountNumber, pin, user);
      customer(input, user, adminMenu, userMenu, accountNumber, pin);
    }
    if(userMenuChoice == 2){
      System.out.println("---------------------------------------------------");
      userMenu.getCheckingsBalance(accountNumber, pin, user);
      userMenu.depositCheckings(input, accountNumber, pin, user);
      customer(input, user, adminMenu, userMenu, accountNumber, pin);
    }
    if(userMenuChoice == 3){
      System.out.println("---------------------------------------------------");
      userMenu.getCheckingsBalance(accountNumber, pin, user);
      userMenu.withdrawCheckings(input, accountNumber, pin, user);
      customer(input, user, adminMenu, userMenu, accountNumber, pin);
    }
    if(userMenuChoice == 4){
      System.out.println("---------------------------------------------------");    
      userMenu.getSavingsBalance(accountNumber, pin, user);
      customer(input, user, adminMenu, userMenu, accountNumber, pin);
    }
    if(userMenuChoice == 5){
      System.out.println("---------------------------------------------------");     
      userMenu.getSavingsBalance(accountNumber, pin, user);
      userMenu.depositSavings(input, accountNumber, pin, user);
      customer(input, user, adminMenu, userMenu, accountNumber, pin);
    }
    if(userMenuChoice == 6){
      System.out.println("---------------------------------------------------");
      userMenu.getSavingsBalance(accountNumber, pin, user);
      userMenu.withdrawSavings(input, accountNumber, pin, user);
      customer(input, user, adminMenu, userMenu, accountNumber, pin);
    }
    if(userMenuChoice == 7){
      System.out.println("---------------------------------------------------");
      login(input, user, adminMenu, userMenu);}
    
  }
}
