package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		Integer N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			
			System.out.print("Natural or Legal (n/l)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();

			if (ch == 'n') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();

				list.add(new NaturalPerson(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();

				list.add(new LegalPerson(name, annualIncome, numberEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Person person : list) {
			System.out.println(person.getName() 
					+ ": $ " + String.format("%.2f", person.taxPaid()));
		}

		System.out.println();

		double totalTaxes = 0.0;
		for (Person person : list) {
			totalTaxes += person.taxPaid();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		sc.close();

	}

}
