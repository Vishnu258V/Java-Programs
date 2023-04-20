package Date_21_12_2022;

import java.util.Scanner;



 public class BankingManagementSystem
{
private String name;
private String address;
private char acc_type;
private int balance;
private int amount;
private int accno;

// Constructor of class Bank
    BankingManagementSystem()
{

// // Initializing values 0 for float
// // and null for String and character
name = " ";
address = " ";
acc_type = ' ';
balance=0;

}

// Method to open the account

void open_account()
{
Scanner sc = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter username");

     name = sc.nextLine(); // Read user input
    System.out.println("name is: " + name);
   
     //Scanner add = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter Address");

     address = sc.nextLine(); // Read user input
    System.out.println("Address is: " + address);
   
    System.out.println("What type of account you want to open saving(S) or Current(C):");
    System.out.println("Enter Account Type");
   
    char type1 = sc.next().charAt(0);
    if (type1 =='S' || type1 == 's')
    {
    System.out.println("Account Type is Saving");
    }
    else if(type1 == 'C' || type1 == 'c')
    {
    System.out.println("Account Type is Current");
    }
    else
    {
    System.out.println("Invaild Input");
// break;
    }
   
   
   

    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter Balance");
   
     balance=sc1.nextInt();
    //System.out.println("Enter Balance");
   
   
    //balance = 8000;
   // System.out.println("Enter How much money you want to deposit: ");
    System.out.println("Account Created Successfully");
}

// Method to deposit the account
void deposit_money()

{


    Scanner sc2 = new Scanner(System.in);
    System.out.println( "Enter how much money you want to deposit" );
   // System.out.println( "Enter how much money you want to deposit: "+ amnt);
   
   
int amount=sc2.nextInt();

    balance+=amount;
//System.out.println( "Enter how much money you want to deposit:" +amnt);
    //int bal = amnt;
    //bal+=amnt;
    System.out.println( "\n Available Balance: "+balance);
    }                                      




// Method to withdraw the account
void withdraw_money()
{
Scanner wit=new Scanner(System.in);
   
   
    System.out.println("Enter how much money you want to withdraw: ");
    int amount=wit.nextInt();
    balance -= amount;
    System.out.println("\n Available balance: "+ balance);      
}

void acc_no()
{
int min=14000000;
int max=90000000;

System.out.println("Your Acount Number IS:");
accno=(int) (Math.random()*(max-min+1)+min);
System.out.println(accno);
}
//Method to display the account
void display_account()
{
System.out.println("Name: " + name);
System.out.println("Address: " + address);
System.out.println("Type: " + acc_type);
System.out.println("Balance: " + balance);
System.out.println("Account No:"+accno);
}

// Driver code
public static void main(String[] args)
{
   
   
   
    // Creating Customer Object of Bank Class
	BankingManagementSystem customer=new BankingManagementSystem();
    Scanner input=new Scanner(System.in);
   
   
   
   
   
    System.out.println("BANK MANAGEMENT SYSTEM");
   
   
    System.out.println("\n1) Open account \n");
     
    // Calling open_account() method
    // through customer object.
    customer.open_account();
    customer.acc_no();
   
    System.out.println("\n-------------------------------------------------\n");
    System.out.println("a.Deposit Money"+'\n'+"b.Withdraw Money"+'\n'+"c.Show Details");
    String Options=input.nextLine();
    switch(Options)
    {
    case "a":System.out.println(" Deposit Money ");
     
    // Calling deposit_money() method
    // through customer object.
   
    System.out.println("\n-------------------------------------------------\n");
    customer.deposit_money();
    break;
   
    case "b":System.out.println(" Withdraw Money ");
     
    // Calling withdraw_money() method
    // through customer object.
   
    System.out.println("\n-------------------------------------------------\n");
    customer.withdraw_money();
    break;
   
    case "c" :System.out.println(" Show Details");
     
    // Calling display_account() method
    // through customer object.
   
    System.out.println("\n-------------------------------------------------\n");
    customer.display_account();
    break;
   
   
 }
}
}