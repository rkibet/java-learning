package mainpackage;

import java.util.Scanner;

public class SwitchFile {
	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Index");
		int index=reader.nextInt();
		
		switch(index) {
		case 1:
			System.out.println("Male");
			break;
		case 2:
			System.out.println("Female");
			break;
		default:
			System.out.println("Unknown");
			break;
		}
		
	}

}
