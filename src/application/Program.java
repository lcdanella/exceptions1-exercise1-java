package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account cc = new Account(number, holder, initialBalance, withdrawLimit);
					
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			cc.withdraw(amount);
		}
		catch (DomainException e){
			System.out.println("Withdraw error: "+ e.getMessage());
		} 
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
	}	

}
