Goal: Create a bank system using OOP that has users with a Account Number, PIN, checkings balance, and savings balance and a admin that runs the system.

Input: 

Login - user inputs their account number and pin

User Menu - user inputs a number 1 - 7 to choose a option in the menu, they can also input a amount to deposit or withdraw in their checkings or savings account

Admin Menu - admin inputs a number 1 - 5 to choose a option in the menu, admin can add a user by inputting a new account number and pin, delete a user by inputting the account number 
and pin of the user they want to delete, apply interest to all savings accounts in the system by inputting a rate and months they wish to apply the interest for. 

Output:

Login - system outputs a prompt for user to input their acccount number and pin 

User Menu - outputs a 7 option menu, including Show Checkings Balance, Deposit in Checkings, Withdraw from Checkings, Show Savings Balance, Deposit in Savings, Withdraw from Savings, and Exit to Login
Screen. Show Checkings Balance outputs the users checking balance, Deposit in Checkings outputs the users balance and a prompt to enter the amount the want to deposit which it then outputs a message that tells the user how much they deposited, Withdraw in Checkings outputs the users balance and a prompt for user to enter the amount they want to withdraw, after it outputs a message that tells the user how much they withdrew. For showing, depositing, and withdrawing the Savings balance, the same output would be shown for its balance.

Admin Menu - outputs a 5 option menu, including Add a User, Delete a User, List All Users, Apply Interest, and Exit to Login.
 
Add a user would output a prompt to enter a new account number and pin and then a prompt for when the user was successfully added, delete user would also prompt for a account number and pin and then 
output a message when the user is successfully deleted. 

List Users would output all the Users and their account numbers and pins.

Apply Interest would output a prompt asking the user to input a decimal between 0 and 1 for the rate that will be used, and the number of months they want to apply it for.

Steps:

Create a Account class that would be a data type for a Users checkings account and a Users savings account

In the Account class create a protected instance double variable called balance, this would hold the double value of the respective accounts balance.

Create a constructor for the Account class that assigns a double parameter value to the instance of the balance variable, using keyword this. 

Create a double getBalance method which returns the value of the balance instance variable. 

Create a void deposit method that takes a double parameter of amount, and checks if this amount is greater than 0, if so adds it the accounts balance instance variable. If the amount is less than 0, 
the system will output a error message telling the user the amount is either 0 or less than 0, and the user has to retry with an amount larger than 0. If the amount is larger than 0, it will 
successfully deposit the amount and output a message telling the user the amount they deposited. 

Create a void withdraw method that also takes a double parameter of amount, and checks if the amount is less than the users total balance for the account, if so subtracts the amount from the accounts
balance instance variable, and outputs a message telling the user how much they withdrew. If the amount is greater than the accounts balance or equal to it, the system will output a error message telling
the user it was unable to withdraw the amount because it was greater than or equal to the accounts balance and the user should retry with a lower amount.

Create a void applyInterest method that takes a double parameters of rate and months, and then multiplies the accounts balance instance variable by a interest equation of (1+rate*months) to give the new
balance after interest.

Create a User class that would represent the data structure for a User 

In the User class, create protected instance variables of type Account (pulling from the Account class) for checkings and savings. Account checkings and Account savings would represent the 2 accounts a
User has. 

Create protected instance int variables for accountNumber and PIN. Each User has a account number and a pin of type Int. 

Create a constructor for the User class that takes a int parameter for account number and pin, and a Account parameter for checkings and savings and assigns them to their respective instance
variables

Create get methods for account number, pin, checkings, and savings that return their respective values.

Create a abstract class called Menu which will hold the declarations for all the menu methods.

In the abstact Menu class, declare and create abstract methods with no body for each menu option, combined of admin and customer menu options.

The menu options would include addUser, deleteUser, listUsers, interest, getCheckingsBalance, depositCheckings, withdrawCheckings, getSavingsBalance, depositSavings, withdrawSavings.

addUser would take parameters of a Scanner variable which is the object that takes user input, and the ArrayList<User> variable that holds all the data for all the users using the data structure from the User class, both these variables would be defined in the Main class.

deleteUser and the interest method would also take parameters of the Scanner variable and the ArrayList<User> variable

listUsers would take the ArrayList<User> variable as a parameter

getCheckingsBalance and getSavingsBalance would take ArrayList<User> variable, int account number variable, and int pin variable as parameters, the account number and pin variables would be passed from
the main class when the user logins in with their account number and pin

The deposit and withdraw methods for checkings and savings would take the Scanner variable, ArrayList<User> variable, int account number, and int pin variable as parameters.

Create a AdminMenu class that extends the Menu class, inheriting its methods but only implementing the methods which can be used by the admin user in the system

Create the void addUser class which takes Scanner and ArrayList<User> as parameters 

Declare a boolean variable that represents if a user already exists in the system

Use a while loop that runs while the boolean is true, printing out a statement asking user to input a new account number and using Scanner to get the input as a int and assign the input to a new variable. 
Use a for loop that goes through each user in the ArrayList and gets the account number for each user and checks if the inputted account number already exists, if it already exists tell the user the
account number is already in use and to input a new account number repeating the while loop. 

If the account number does not already exist end the while loop and ask the user to input a new pin, using Scanner to get the pin as a int. 

Once the admin has inputted a account number and pin successfully, add these values into the User ArrayList, creating a new instance of User in the ArrayList, and giving this new User a Checkings account
and Savings account by creating 2 new instances of Account, one for checkings and one for savings and passing a 0 to these new Accounts so the Account constructor sets the default balance to 0.

Create the deleteUser method taking the Scanner and Arraylist input

Ask the admin to enter the account number and pin of the account they wish to delete, use Scanner to retrive these inputs as ints. Use a for loop to go through each user in the ArrayList and get their    account numbers and pins using the get methods from the User class and check if they match the inputted account number and pin. 

If the inputted values for acccount number and pin do not match one of the Users from the Arraylist, tell the admin the user was not found.

If the user is found, check if the users checkings and savings balances are 0, use the getters for checkings and savings from User and the getBalance method form Account, if so remove the user from       the Arraylist and tell the admin the user was removed successfully. 

If the user does not have a 0 balance in both checkings and balance, tell the admin the user cant be removed due to this.

Create the listUsers method which takes the User Arraylist as a parameter

Use a for loop to go through each User in the User ArrayList and get the Account Number and PIN of each User using their get methods and print the two values

Create the interest method which takes Scanner and User ArrayList as parameters

Ask the admin to input a interest rate between 0 and 1 and get the input as a double using Scanner
Ask the admin to input the number of months and get the input as a double using Scanner

Use a for loop to loop through each User in the User ArrayList, get the Savings Account of each User and then use the applyInterest method from the Account class on each Savings Account, passing the      inputted values of rate and months into the applyInterest method, which applies the interest to each Savings balance

Once the for loop is complete, tell the admin the interest was applied to all accounts.

Implement the other User methods with empty bodies to override them in AdminMenu.

Create a UserMenu class that extends Menu, inheriting its methods but only implementing the User menu option methods

Implement the getCheckingsBalance method that takes int accountNumber, int pin, User ArrayList as parameters

The accountNumber and pin passed into all the methods in UserMenu would be passed when the User logs in by inputting a account number and pin in Main, these would be used to access their data from the User ArrayList.

Use a for loop to loop through each User in the User ArrayList and find the User in the arraylist by checking if the accountNumber and pin match the values of the parameters passed in

Use the get Checkings method and get Balance method to retrive the balance of the users checkings account and store it into a variable, print the variable 

For the getSavingsBalance method, it would follow the same algorithm as the getCheckingsBalance, except use the get Savings method and print its balance.

Create the depositCheckings method that takes Scanner, accountNumber, pin, and User ArrayList as parameters 

Ask the user how much they want to deposit and take the input as a double using Scanner and store it into amount.

Use the for loop to find the User in the ArrayList and get the Users checkings account and then calling the deposit method from Account with a parameter of the amount inputted.

Create the depositSavings method following the same algorithm as depositCheckings except getting the Users savings account with the getSavings method

Create the withdrawCheckings method that takes scanner, accountNumber, pin, and User arraylist as parameters.

Ask the user how much they wish to withdraw and store the input as a double into a variable called amount.

Use a for loop to loop through the User Arraylist and find the User in the arraylist using their accountNumber and pin.

Get the Users checkings account and call the withdraw method from Account class taking amount as a parameter.

Repeat the same steps to make the withdrawSavings method except getting the savings account and using withdraw on it

Implement the other Admin methods with empty bodies to override them.

Create the Main class

Create a static void login method which starts the system

Ask the user to input their account number and pin

If the inputted account number is equal to 0 and the inputted pin is equal to 12345, take the user to the admin menu by calling the admin method.

Otherwise, use a for loop to loop through the User arraylist and find the User in the arraylist, if found send the user to the customer menu by calling the customer method and passing the inputted accout number and pin, so the system pulls the correct users data

Create a static void admin method

Print out all the options for the Admin Menu with a corresponding number

Ask the admin to input the corresponding number for the option they wish to choose

Use if statements to check if the input matches either a 1,2,3,4,5

1 represents adding a user, and its if statement would call the addUser method from AdminMenu by referencing its object 

2 represents deleting a user, and would call the respective method from AdminMenu

3 represents listing all users, calling the listUsers method from AdminMenu

4 represents apply interest to all savings accounts, and would call the interest method from AdminMenu

5 represents Exit to login, calling the login method

Create the static void customer method

Print the options for users with corresponding numbers

Ask the customer to input the corresponding number to which option they wish to choose

Use if statements to check if the input is a 1,2,3,4,5,6, or 7

1 represents get checkings balance, and would call the getCheckingsBalance method from UserMenu

2 represents deposit into checkings, call depositCheckings method from UserMenu

3 represents withdraw from checkings, call withdrawCheckings method from UserMenu

4 represents get savings balance, call the getSavingsBalance method from UserMenu

5 represents deposit into savings, call the depositSavings method from UserMenu

6 represents withdraw from savings, call the withdrawSavings method from UserMenu

7 represents Exit to login, calling the login method

Create a main(string [] args) static void method which runs the program

Initialize and create the ArrayList<User> arraylist holding all Users data as a new object 

Initialize the AdminMenu and UserMenu class as new objects

Initialize the Scanner object to take input

Call the login method where the program user starts.


