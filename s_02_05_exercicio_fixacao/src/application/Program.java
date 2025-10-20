package application;

import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Account;
import Model.Exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		Account acc = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.println();
		try {
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			acc.withdraw(withdraw);

			System.out.println(acc);
		} catch (BusinessException e) {
			System.out.println("Widthdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();

	}

}
