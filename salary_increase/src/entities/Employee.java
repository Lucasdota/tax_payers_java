package entities;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double percentage) {
		double increaseAmount = salary * (percentage/100);
		this.salary += increaseAmount;
	}

	@Override
	public String toString() {
		return name + ", " + id + ", salary = " + salary;
	}
	
}
