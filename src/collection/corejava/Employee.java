package collection.corejava;

public class Employee {

	private String name;
	private String id;
	private String designation;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, String id, String designation, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", designation=" + designation + ", salary=" + salary + "]";
	}

}
