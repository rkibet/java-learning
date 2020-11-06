package mainpackage;

import java.util.Calendar;
import java.util.Scanner;

public class MyAge {
	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter Year Of Birth");
		int dob =reader.nextInt();
		
		int year=Calendar.getInstance().get(Calendar.YEAR);
		
		int age=year-dob;
		System.out.println("You are ("+age+") Years"+" As At :"+year);
	}

}
