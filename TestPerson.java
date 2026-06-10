package homework_java;

public class TestPerson {

	public static void main(String[] args) {
		
		System.out.println("Test person Staff employee Faculty finished by Jean");
		System.out.println("Create and display an employee.");

        Employee e1 = new Employee();
        e1.display();

        Employee e2 = new Employee("Jean", "111 Main ST", "773-111-222",
                                   "smith@theeastwest",
                                   54000.0, "w415",
                                   new MyDate(2026, 6, 8));
        e2.display();

	}

}
