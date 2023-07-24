package intermediateOOPS;

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public double calculateSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
}

class Manager extends Employee {

	private double incentive;

	public Manager(String name, double salary, double incentive) {
		super(name, salary);
		this.incentive = incentive;
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + incentive;
	}
}

class Labour extends Employee {

	private double overTime;

	public Labour(String name, double salary, double overTime) {
		super(name, salary);
		this.overTime = overTime;
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + overTime;
	}
}

public class Organization {

	public static void main(String[] args) {

		Employee emp1 = new Manager("Anil", 50000, 2000);
		Employee emp2 = new Manager("Sunil", 20000, 1200);
		Employee emp3 = new Manager("Naresh", 10000, 150);
		Employee emp4 = new Manager("Mahesh", 15500, 2200);

		double totalSalary = 0;

		System.out.println("Total salary of " + emp1.getName() + ": " + emp1.calculateSalary());
		System.out.println("Total salary of " + emp2.getName() + ": " + emp2.calculateSalary());
		System.out.println("Total salary of " + emp3.getName() + ": " + emp3.calculateSalary());
		System.out.println("Total salary of " + emp4.getName() + ": " + emp4.calculateSalary());

	}
}
