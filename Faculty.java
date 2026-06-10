package homework_java;

public class Faculty extends Employee{
	
	 protected String officeHours;
	    protected String rank;

	    public Faculty() {
	        super();
	        this.officeHours = "";
	        this.rank = "";
	    }

	    public Faculty(String name, String address, String phone, String email,
	                   String office, double salary, MyDate dateHired,
	                   String officeHours, String rank) {
	        super(name, address, phone, email,salary, office, dateHired);
	        this.officeHours = officeHours;
	        this.rank = rank;
	    }

	    //Override
	    public String toString() {
	        return "Faculty: " + name;
	    }

}
