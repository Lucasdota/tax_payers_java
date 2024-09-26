package application;

import java.util.Scanner;
import entities.Pensionato;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pensionato[] pensionato = new Pensionato[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.printf("%nRent #%d%n", (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			pensionato[room] = new Pensionato(name, room, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i<pensionato.length; i++) {
			if (pensionato[i] != null) {
				System.out.println(pensionato[i].toString());
			}
		}
		
		sc.close();
	}

}
