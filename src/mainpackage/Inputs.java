package mainpackage;

import java.util.Scanner;

public class Inputs {
static Scanner reader = new Scanner(System.in);
static Scanner reader1=new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("Enter Name");
	String name=reader.nextLine();
	
	System.out.println("Enter Age");
	int age=reader.nextInt();
	
	System.out.println("Enter Salary");
	double salary=reader.nextDouble();
	
	System.out.println("Enter Gender");
	String input=reader1.nextLine();
	char gender=input.charAt(0);
	
	System.out.println("Enter Pi");
	float pi=reader.nextFloat();
	
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("Salary :"+salary);
	System.out.println("Gender :"+gender);
	System.out.println("Pi :"+pi);
}
}
