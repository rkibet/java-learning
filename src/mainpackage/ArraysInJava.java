package mainpackage;

import java.util.Scanner;

public class ArraysInJava {
static Scanner reader =new Scanner(System.in);
public static void main(String[] args) {
	
	String[] jobs = new String[5];
	/*
	jobs[0]="Developer";
	jobs[1]="Testerr";
	jobs[2]="Support";
	jobs[3]="Manager";
	jobs[4]="Admin";*/
	System.out.println("Enter the Job");
	for(int i=0;i<5;i++)
	jobs[i]=reader.nextLine();
	
	System.out.println("Print Job");
	
	for(int i=0;i<5;i++) {
		System.out.println("Job Position :"+jobs[i]);
	}
}
}
