package com.ATM_2;

import java.util.Scanner;

//deposit, withdraw, balance check,exit

// It will Display the Options 
class DisplayOptions {

	public void options() {
		System.out.println(" ");
		System.out.println("Choose the number for specific operation\n ");
		System.out.println("1- BALANCE ENQUIRY\t\t2- CASH DEPOSIT");
		System.out.println("3- CASH WITHDRAW\t\t4- Exit");
	}

}

// All the required  Attributes & 
// Getters and Setters 
class Attributes {

	private double balance = 50000;
	private double deposit;
	private int withdraw;
	int exit;

	// Getters
	public double getBalance() {
		return balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	// Setters
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
}


class Operations {
	Attributes a1 = new Attributes();
	Scanner sc = new Scanner(System.in);

	// Checking Balance Option
	public void BalanceCheck() {
		System.out.println("\nTotal Balance = " + a1.getBalance()+"\n\n\t\tThank you !");
	}

	// Deposit Option
	public void Deposit() {
		System.out.println("\nEnter the Amount to deposit ");
		double deposit = sc.nextDouble();
		a1.setBalance(a1.getBalance() + deposit);
		System.out.println("\nTotal Balance = " + a1.getBalance()+"\n\n\t\tThank you !");
	}

	// Withdraw Option
	public void Withdraw() {
		System.out.println("\nEnter the Amount to Withdraw ");
		int withdraw = sc.nextInt();

		if (withdraw <= 20000) {

			if (withdraw <= a1.getBalance() && withdraw % 100 == 0) {
				a1.setBalance(a1.getBalance() - withdraw);
				System.out.println(
						"\nPlease Collect your Money\nRemaining Balance = " + a1.getBalance() + "\n\n\t\tThank you !");
			} else {
				System.out.println("\nPlease Enter the amount in 100s only\n\n\t\tThank you ! ");
			}
		} else if (withdraw > a1.getBalance()) {
			System.out.println("\nInsufficent Funds\n\t\tThank you ! ");
		} else {
			System.out.println("\nDaily Limit Exceeding\n\n\t\tThank you ! ");
		}
	}

	// Exit Option
	public void Exit() {
		System.out.println("\nThank you for visiting ");
	}
}

// Main Method
public class ATM_Machine {
	public static void main(String[] args) {

		DisplayOptions dis = new DisplayOptions();
		Operations op = new Operations();

		// ---(Pin Initialized as  2311 )---//
		System.out.println("\t\t\tWelcome !\n\t\t   Enter your ATM Pin");
		Scanner sc = new Scanner(System.in); 
		int pin = sc.nextInt();	
		
		// pin Checking   (Pin Initialized as = 2311 )  //
				if (pin == 2311) {
					dis.options();
		
					// Choosing the functions
		
					int functionNum = sc.nextInt();
		
					if (functionNum == 1) {
		
						op.BalanceCheck();
					} else if (functionNum == 2) {
		
						op.Deposit();
					} else if (functionNum == 3) {
		
						op.Withdraw();
					} else if (functionNum == 4) {
		
						op.Exit();
					} else {
						System.out.println("\nChoose the correct Operation Number  ");
					}
		
				} else {
					System.err.println("You have Entered the Wrong Pin ");
				}
	}
}
