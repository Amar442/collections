package collection.corejava;

public class ArraysVsCollection {
	public static void main(String[] args) {
		Employee[] empArray = new Employee[3];

		empArray[0] = new Employee("Amar", "SI107", "developer", 25);

		empArray[1] = new Employee("ABC", "hg425", "tester", 15);

		empArray[2] = new Employee("xyz", "jh456", "Architect", 35);

		for (Employee employee : empArray) {
			System.out.println(employee);
		}

	}

}
