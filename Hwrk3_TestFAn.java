package homework_java;

public class Hwrk3_TestFAn {

	public static void main(String[] args) {
		System.out.println("Homework 3 Fan class finished by Jean Oussou");

        // First fan: FAST, on, radius 10, yellow
        Fan fan1 = new Fan();
         fan1.setOn(true);
         fan1.SetSpeed(3);
         fan1.SetRadius(10);
         fan1.SetColor("yellow");
     
         // Second fan: MEDIUM, off, radius 5, blue
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.SetSpeed(2);
        fan2.SetRadius(5);
        fan2.SetColor("blue");
        
       
        // Print both fans 
        System.out.println("Fan 1 :\n" + fan1.toString());
        System.out.println("Fan 2 :\n" + fan2.toString());	}

}
