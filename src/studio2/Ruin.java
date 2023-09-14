package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 

		System.out.println ("What is your start amount?"); 
		int startamount = in.nextInt();   
		System.out.println ("what is your win chance? "); 
		double winchance = in.nextDouble();
		System.out.println ("how many times have you played? ");
		int numberofplays = in.nextInt(); 
		
		
		while (startamount > 0 && startamount < 10)  
			{
			int chance = (int)(Math.random() * 2); 
			System.out.println(startamount);  
			numberofplays++;
			
				//add one
				if (chance <= winchance)  
				{
					startamount++;   
				}
				
				if (chance >= winchance)   
				{
					startamount--;   
				}
				
				
			}	
			 
			System.out.println ("You played " + numberofplays + " times!");
			
		
	}
	
}
