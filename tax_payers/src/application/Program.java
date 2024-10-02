package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.Payer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Payer> payers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			String type = sc.nextLine();
			if (type.charAt(0) == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double income = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double expenditures =  sc.nextDouble();
				payers.add(new IndividualPayer(name, income, expenditures));
				sc.nextLine();			
			} else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double income = sc.nextDouble();
				System.out.print("Number of employees: ");
				Integer employees =  sc.nextInt();
				payers.add(new CompanyPayer(name, income, employees));
				sc.nextLine();
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for (Payer payer: payers) {
			System.out.printf("%s: $ %.2f%n", payer.getName(), payer.subTotal());
			sum += payer.subTotal();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
	}

}
