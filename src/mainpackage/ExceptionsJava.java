package mainpackage;

import java.util.Scanner;

public class ExceptionsJava {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please Enter a Number");
		try {
			int number1=reader.nextInt();
			System.out.println("The Entered Number is:"+number1);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("------------Process Is End------------");
		}
		System.out.println("------------End------------");
	}

}
