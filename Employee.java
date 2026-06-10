package homework_java;

public class Employee extends Person  {
	
	 protected double salary;
	    protected String office;
	    protected MyDate hireDate;

	    public Employee() {
	        super();
	        System.out.println("Employee default constructor");
	        this.salary = 0.0;
	        this.office = null;
	        this.hireDate = null;
	    }

	    public Employee(String name, String address, String phone, String email,
	                    double salary, String office, MyDate hireDate) {
	        super(name, address, phone, email);
	        System.out.println("Employee constructor");
	        this.salary = salary;
	        this.office = office;
	        this.hireDate = hireDate;
	    }

	    //Override
	    public void display() {
	        super.display();
	        System.out.println("Class : Employee");
	        System.out.println("Employee Salary : " + salary);
	        System.out.println("Employee Office : " + office);
	        System.out.println("Employee HireDate : " + hireDate);
	        System.out.println("------------------------------");
	    }

}
