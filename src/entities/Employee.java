package entities;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	//Constructors
	public Employee() {
	}
	
	//método construtor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//get and set
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	public void increaseSalary(double percent) {
		salary += salary * (percent/100); 
	}

	@Override
	public String toString() {
		return id
				+ ", "
				+ name
				+", " 
				+ String.format("%.2f%n", salary);
	}

}
