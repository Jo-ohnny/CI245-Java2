package homework_java;

public class Person {
	
	protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person() {
        System.out.println("Person constructor - no argument");
        this.name = null;
        this.address = null;
        this.phone = null;
        this.email = null;
    }

    public Person(String name, String address, String phone, String email) {
        System.out.println("Person constructor - with specific value");
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void display() {
        System.out.println("Class : Person");
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println("------------------------------");
    }

}
