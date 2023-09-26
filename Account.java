import java.util.*;
import java.io.*;
public class Account{
  protected double balance;

  public Account(double balance) {
    this.balance = balance;}

  public double getBalance() {
    return this.balance;}

  public void deposit(double amount){
    if(amount > 0){
      this.balance += amount;
      System.out.println(amount + " deposited.");}
    else{ 
      System.out.println("Unable to deposit: The amount you wish to deposit is less than or equal to 0. Retry with a amount larger than 0.");}
  }

  public void withdraw(double amount){
    if(amount < this.balance){
      this.balance -= amount;
      System.out.println(amount + " withdrawn.");}
    else { 
      System.out.println("Unable to withdraw: The amount you wish to withdraw exceeds or matches your Account balance. Retry with a amount less than your balance");}
  }

  public void applyInterest(double rate, double months) {
    this.balance *= (1+(rate*months));}
 

}

