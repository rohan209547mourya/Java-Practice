package com.rohan.main;

import java.util.Scanner;

import com.rohan.dao.AccountDao;
import com.rohan.dao.impl.AccountImpl;
import com.rohan.entities.Account;

import antlr.JavaCodeGeneratorPrintWriterManager;

public class Main {

	
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("1: To Find User ");
		System.out.println("2: To Add New User ");
		System.out.println("3: To Delete User ");
		System.out.println("4: To WithDraw Money ");
		System.out.println("5: To Deposite Money");
		
		
		int n = sc.nextInt();
		
		
		AccountDao ops = new AccountImpl();
		
		switch (n) {
		
			case 1: {
				
				System.out.println("Enter Account holder Id: ");

				int id = sc.nextInt();
				
				try {
					
					System.out.println(ops.findById(id));
				}
				catch(IllegalArgumentException e) {
					
					
					System.out.println(e.getMessage());
				}
			}
			
			break;
			
			case 2: {
				
				System.out.println("Enter user id: ");
				int id = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter user email: ");
				String email = sc.nextLine();
				
				System.out.println("Enter user address: ");
				String address = sc.nextLine();
				
				System.out.println("Enter opening amount: ");
				
				double bal = sc.nextDouble();
				
				String k = ops.save(new Account(id, email, address, bal));
				
				
				System.out.println(k);
			}
			break;
			case 3: {
				
			
				System.out.println("Enter Account holder Id: ");

				int id = sc.nextInt();
				
				System.out.println(ops.deleteAccountById(id));
			}
			break;
			case 4: {
				
				
				System.out.println("Enter Account holder Id: ");

				int id = sc.nextInt();
				
				System.out.println("Enter amount to be withdrawn? : ");
				
				double am = sc.nextDouble();
				
				System.out.println(ops.withdraw(am , id));
				
				
			}
			break;
			case 5: {
				
				
				System.out.println("Enter Account holder Id: ");

				int id = sc.nextInt();
				
				System.out.println("Enter amount to be deposite? : ");
				
				double am = sc.nextDouble();
				
				System.out.println(ops.deposit(am , id));
				
			}
			break;
			
			
		default: System.out.println("Invalid Input!");
			break;
		}
		
		
		
		sc.close();
		
	}
	
	
	
	
}
