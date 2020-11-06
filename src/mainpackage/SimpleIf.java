package mainpackage;

import java.util.Calendar;
import java.util.Scanner;

public class SimpleIf {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter Year Of Birth");
		
		int dob = reader.nextInt();
		int year=Calendar.getInstance().get(Calendar.YEAR);
		int age=year-dob;
		
		if(age>=18) 
		{
			System.out.println("Please Produce Your ID");
		}
		else {
			System.out.println("You are Underage");
		}
	}

}
