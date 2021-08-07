package com.adapt.capgemini;

import java.util.*;

class Account {
	int accountNo;
	double balance;
	String accountType;
	static int counter;

	Account(double balance, String accountType) {
		this.accountType = accountType;
		this.balance = balance;
		this.accountNo = ++counter;
	}

	public void depositAmount(double amount) {
		balance += amount;
	}

	public void printAccountDetails() {
		System.out.println("[Acct No : " + accountNo + " Type : " + accountType + " Balance : " + balance + "]");
	}
}

public class AccountDetails {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input1[], input2[];
		input1 = sc.nextLine().split(" ");
		input2 = sc.nextLine().split(" ");
		Account ac1 = new Account(Double.parseDouble(input1[0]), input1[1]);
		ac1.printAccountDetails();
		ac1.depositAmount(Double.parseDouble(input1[2]));
		System.out.println("New Balance : " + ac1.balance);

		Account ac2 = new Account(Double.parseDouble(input2[0]), input2[1]);
		ac2.printAccountDetails();
		ac2.depositAmount(Double.parseDouble(input2[2]));
		System.out.println("New Balance : " + ac2.balance);
		sc.close();
	}
}
