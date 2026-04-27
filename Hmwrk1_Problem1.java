package homework_java;
/*
 *  Date :4/23/26
 *  Programmer: Jean Oussou
 *  
 *  1) In main method, ask user to enter the number of elements
	2) Then in main methods, you create two arrays
	3) In main method: ask user to enter numbers for list 1.
	4) In main method: ask user to enter numbers for list 2.
	5) Create a method to display all numbers.
	6) Create a method to compare each number:*/

import java.util.Scanner;

public class Hmwrk1_Problem1 {

	public static void main(String[] args) {
		System.out.println("Problem 1 finished by Jean oussou");
		
		//create a new Scanner
		Scanner Read = new Scanner(System.in);
		
		
		//1) In main method, ask user to enter the number of elements
		System.out.print("Enter number of elements: ");
		
		
        int Enum = Read.nextInt();

        // Create arrays 
        int[] list1 = new int[Enum];
        int[] list2 = new int[Enum];

        // ---------------- LIST 1 ----------------
        System.out.println("Enter numbers for list 1");
        System.out.println("------------------------------- ");
        for (int i = 0; i < Enum; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            list1[i] = Read.nextInt();
        }

        System.out.println("");

        // ---------------- LIST 2 ----------------
        System.out.println("Enter numbers for list 2");
        System.out.println("------------------------------- ");
        for (int e = 0; e < Enum; e++) {
            System.out.print("Enter number " + (e + 1) + ": ");
            list2[e] = Read.nextInt();
        }

        System.out.println("");

        // Display list 1
        System.out.println("List 1 -------------------------");
        displayList(list1);
        
        // Display list 2
        System.out.println("\nList 2 -------------------------");
        displayList(list2);
		
        
       boolean res= compareList(list1 , list2);
       
       if(res) {
    	   System.out.println("\nList 1 and list 2 are identitiques");
       }
       else {
    	   System.out.println("\nList 1 and list 2 are not identitiques");
       }
     
     /* switch( res) {
      case true:
    	  System.out.println("List 1 and list 2 are identitiques");
    	  break;
    	  
      case false:
    	  System.out.println("List 1 and list 2 are not identitiques");
    	  break;
      } */

	}//------------------------End of Main---------------------------------

	// Create a method to display all numbers.
	
    public static void displayList(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(""+ array[i] + " ");
            
        }
    }
    
    //6) Create a method to compare each number
    public static boolean compareList(int[] array, int[] array1) {
    	
    	for (int i =0 ; i < array.length; i++) {
    		if (array[i] == array1[i]) {
    			
    			
    			return true;
    		}
    	}
    	
    	return false;
    	
    	
    }
}
