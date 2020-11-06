package mainpackage;

import java.util.Scanner;

public class LoopsInJava {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args)

	{
		System.out.println("Enter the Initial Value");
		int initialValue = reader.nextInt();
		System.out.println("Enter the Final Value");
		int finalValue = reader.nextInt();

		// printing hello kibet 5 times

//		for (int i = initialValue; i < 5; i++) {
//			System.out.println("Hello Kibet");
//		}

		// print count 5 time

//		for (int i = initialValue; i < finalValue; i++) {
//			System.out.println("Count :" + i);
//		}

		// print even numbers

//		for (int i = initialValue; i < finalValue; i = i + 2) {
//
//			System.out.println("Even Number" + i);
//		}

//	//divisible by 4

		for (int i = initialValue; i < finalValue; i++)

		{
			if (i % 4 == 0) {
				System.out.println("The Modulus of 4 is:" + i);
			}
		}

	}

}
