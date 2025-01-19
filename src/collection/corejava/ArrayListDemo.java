package collection.corejava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("ABC", "FG852", "ENGINEER", 12));
		employees.add(new Employee("jhg", "moi326", "technical", 6));
		employees.add(new Employee("klop", "lk8569", "support", 5));

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
