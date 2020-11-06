package mainpackage;

import java.util.Scanner;

public class SimpleGrading {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your Mark");
		int mark=reader.nextInt();
		if((mark>=80) &&(mark<= 100)) 
		{
			System.out.println("Grade A");
		}
		else if((mark>=70) &&(mark<= 79)) 
		{
			System.out.println("Grade B");
		}
		else if((mark>=60) &&(mark<= 69)) 
		{
			System.out.println("Grade C");
		}
		else if((mark>=50) &&(mark<= 59)) 
		{
			System.out.println("Grade D");
		}
		else if((mark>=40) &&(mark<= 49)) 
		{
			System.out.println("Grade E");
		}
		else if((mark>=1) &&(mark<= 39)) 
		{
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter A Valid Mark,Try Again");
		}
	}

}
