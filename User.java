import java.util.*;
import java.io.*;
public class User{
  protected Account checkings;
  protected Account savings;
  protected int accountNumber;
  protected int pin;

  public User(int accountNumber, int pin, Account checkings, Account savings) {
    this.accountNumber = accountNumber;
    this.pin = pin;
    this.checkings = checkings;
    this.savings = savings;}

  public Account getCheckings() {
    return this.checkings;}

  public Account getSavings() {
    return this.savings;}

  public int getAccountNumber() {
    return this.accountNumber;}

  public int getPIN() {
    return this.pin;}

}

