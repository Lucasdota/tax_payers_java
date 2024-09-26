package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		// create list to place the employee objects
		List<Employee> employee = new ArrayList<>();
		
		for (int i = 0; i<n; i++) {
			System.out.printf("%nEmployee #%d:%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			employee.add(new Employee(name, id, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int searchId = sc.nextInt();
		
		// create a separate list with the found id's obj
		List<Employee> result = employee.stream().filter(x -> x.getId() == searchId).collect(Collectors.toList());		
		
		// if an id is found
		if (result.size() > 0) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			
			for (Employee obj: result) {
				// find index to put new obj at the correct position
				int index = employee.indexOf(obj);
				// remove old obj
				employee.removeIf(x -> x.getId() == searchId);			
				obj.setSalary(percentage);
				// add new obj
				employee.add(index, obj);
			}			
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj: employee) {
			System.out.println(obj.toString());
		}
		
		sc.close();
	}

}
