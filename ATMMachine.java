package com.project;

import java.util.Scanner;
//Here the pin code is 5656
class ATM{
	float balance = 50000.00f;
	int pin = 5656;
	
	public void checkPin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your PIN code:");
		int PCode = sc.nextInt();
		if(PCode == pin) {
			displayMenu();
		}
		else {
			System.out.println("Invalid PIN code!");
			displayMenu();
		}
		
	}
	public void displayMenu() {
		System.out.println("Welcome to ATM Machine");
		System.out.println("1. Check account balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int option = sc.nextInt();
		
		if(option == 1) {
			checkBalance();
		}
		else if(option == 2){
			withdrawMoney();
		}
		else if(option == 3){
			depositeMoney();
		}
		else if(option == 4){
			logOut();
		}
		else {
			System.out.println("You entered invalid choice! Enter valid choice!");
		}
	}
	public void checkBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PIN code:");
		int pinC = sc.nextInt();
		if(pinC == pin) {
			System.out.println("Your account balance: "+balance);
			displayMenu();
		}
		else {
			System.out.println("Invalid PIN code!");
			displayMenu();
		}
		
	}
	public void withdrawMoney() {
		System.out.println("Enter a pin code:");
		Scanner sc = new Scanner(System.in);
		int pinCode = sc.nextInt();
		
		if(pinCode == pin) {
			System.out.println("Enter amount to withdraw: ");
			float amount = sc.nextFloat();
			if(amount>balance) {
				System.out.println("Insufficient Balance!");
			}
			else {
				balance -= amount;
				System.out.println("Money withdrawal successfully!");
				System.out.println("Your available balance is: "+balance);
			}
			displayMenu();
		}
		else {
			System.out.println("Invalid PIN code!");
		}
		
		displayMenu();
	}
	public void depositeMoney() {
		System.out.println("Enter PIN code:");
		Scanner sc = new Scanner(System.in);
		int pinCode = sc.nextInt();
		if(pinCode == pin) {
			System.out.println("Enter amount to deposite:");
			float amount = sc.nextFloat();
			if(amount>0) {
				balance += amount;
				System.out.println("Your money deposited successfully");
				System.out.println("Your available balance is: "+balance);
			}
			else {
				System.out.println("Invalid money/amount");
			}
			displayMenu();
		}
		else {
			System.out.println("Enter a valid PIN!");
		}
		
	}
	public void logOut() {
		int option = 4;
		if(option == 4) {
			System.out.println("Congratulations! You have log out successfully");
		}
	}
}
public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM obj = new ATM();
		obj.checkPin();
	}

}
