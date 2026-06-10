package homework_java;

public class Staff extends Employee {
	
	 protected String title;

	    public Staff() {
	        super();
	        this.title = "";
	    }

	    public Staff(String name, String address, String phone, String email,
	                 String office, double salary, MyDate dateHired,
	                 String title) {
	        super(name, address, phone, email, salary, office, dateHired);
	        this.title = title;
	    }

	    //Override
	    public String toString() {
	        return "Staff: " + name;
	    }

}
