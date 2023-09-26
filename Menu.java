import java.util.*;
import java.io.*;

public abstract class Menu{

  public abstract void addUser(Scanner input, ArrayList<User> user);

  public abstract void deleteUser(Scanner input, ArrayList<User> user);

  public abstract void listUsers(ArrayList<User> user);
  
  public abstract void interest(Scanner input, ArrayList<User> user);

  public abstract void getCheckingsBalance(int accountNumber, int pin, ArrayList<User> user);

  public abstract void depositCheckings(Scanner input, int accountNumber, int pin, ArrayList<User> user);

  public abstract void withdrawCheckings(Scanner input, int accountNumber, int pin, ArrayList<User> user);

  public abstract void getSavingsBalance(int accountNumber, int pin, ArrayList<User> user);

  public abstract void depositSavings(Scanner input, int accountNumber, int pin, ArrayList<User> user);

  public abstract void withdrawSavings(Scanner input, int accountNumber, int pin, ArrayList<User> user);

}
