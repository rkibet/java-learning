package mainpackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteAFile {
	static Scanner reader= new Scanner(System.in);
	static Scanner reader1= new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.println("1- To Write\n 2-To Read");
int op=reader.nextInt();

switch(op) {
case 1://write
	System.out.println("Enter To Save");
	String text =reader1.nextLine();
	FileWriterOn(text);
	break;
	
case 2://read
	FileReaderOn();
	break;
}

	FileReaderOn();
}
static void FileReaderOn() {
	try 
	{
		FileReader fin = new FileReader("Example.txt");
		int c;
		while((c=fin.read()) !=-1) {
			System.out.print((char) c);
		}
	}
	catch(Exception ex) 
	{
		System.out.println(ex.getMessage());
	}
}
static void FileWriterOn(String str) {
	try {
		FileWriter file1 =new FileWriter("Example.txt",true);
		file1.write(str);
		file1.close();
	}
	catch(Exception ex) 
	{
		System.out.println(ex.getMessage());
	}	
}
}
