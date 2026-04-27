package homework_java;

/*
 * In main method, create a integer array of size 100.
• Then generate 100 integer scores. ( The range is from 0 to 99).
• Create a method to display the scores (10 scores per line);
• Create a method to determines how many scores are above or equal to the average
(Hint: you have to compute the average first)
• Create a method to determines number of scores in each range. (Bonus 10 pts)
• Invoke above methods.
 * */

/*
 * Date: 4/26/26
 * Programmer : Jean oussou*/
public class Hmwrk1_Problem_2 {

	public static void main(String[] args) {
		
		System.out.println("Analyze scores fisnished by Jean Oussou");
		
		/*------------------------------------------------------------------------------*/
		
			/*In main method, create a integer array of size 100.*/
			
			int[] Scores = new int [100];
			
			/*Then generate 100 integer scores. ( The range is from 0 to 99).*/
			
			for(int i = 0; i < Scores.length; i++) {
				
				Scores[i] = (int)(Math.random()*100);
			}
			
			
		/*------------------------------------------------------------------------------*/
		
			//• Create a method to display the scores (10 scores per line);
			
			System.out.println(" ");
			System.out.println("Scores-----------------------------------");
			printScores(Scores);
			
		/*------------------------------------------------------------------------------*/	
			System.out.println("The Above Average is " + averagAndAbove(Scores));
			
			
	   /*------------------------------------------------------------------------------*/		
			System.out.println("Count scores in range");
			System.out.println("\nScores--------------------");
			countRange(Scores);
			
		
	}//----------------------------------------------End of Main-----------------------------------------------------

	public static void printScores(int[] arr) {
	    int i= 0;
		arr[0] =0 ;
		
		for(int row = 0; row<10; row++) { //10 lines
			
			for(int col = 0; col < 10; col++) { //10col
				
				System.out.printf("%3d ",arr[i] ); //print out 
				i++;
			}
			System.out.println(" ");
		}
		
	}
	
	/*• Create a method to determines how many scores are above or equal to the average
	(Hint: you have to compute the average first)*/
	
	public static double averagAndAbove(int[] arr) {
		
		int tot= 0;
		
		double Acount =0.0;  // Acount: Above count
		
		for(int i = 0; i<arr.length; i++) { 
			
			tot += arr[i];
		}
		
		double avg = tot / arr.length ;
/*-----------------------------------------------------------*/
		for(int i = 0; i<arr.length; i++) { 
			
			if (arr[i]>= avg) {
				
				Acount ++;	
			}
		}
		System.out.println("\nThe average is: " + avg );
/*-----------------------------------------------------------*/
		return Acount; 

		}
	
	
	/*Create a method to determines number of scores in each range. (Bonus 10 pts)*/
	
	public static void countRange(int[] arr) {
		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		int count10=0;
		
		for (int i = 0; i < arr.length ; i++) {
			
			if(arr[i]>= 0 && arr[i]<10) count1++;
			if(arr[i]>= 10 && arr[i]<20) count2++;
			if(arr[i]>= 20 && arr[i]<30) count3++;
			if(arr[i]>= 30 && arr[i]<40) count4++;
			if(arr[i]>= 40 && arr[i]<50) count5++;
			if(arr[i]>= 50 && arr[i]<60) count6++;
			if(arr[i]>= 60 && arr[i]<70) count7++;
			if(arr[i]>= 70 && arr[i]<80) count8++;
			if(arr[i]>= 80 && arr[i]<90) count9++;
			if(arr[i]>= 90 && arr[i]<100) count10++;
			
		}
		
		System.out.println("0--9: " + count1 );
		System.out.println("10--19: " + count2 );
		System.out.println("20--29: " + count3 );
		System.out.println("30--39: " + count4 );
		System.out.println("40--49: " + count5 );
		System.out.println("50--59: " + count6 );
		System.out.println("60--69: " + count7 );
		System.out.println("70--79: " + count8 );
		System.out.println("80--89: " + count9 );
		System.out.println("90--99: " + count10 );
	}
	
}
