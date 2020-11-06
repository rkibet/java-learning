package mainpackage;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name,int age) {
		this.age=age;
		this.name=name;		
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
}
public class SortApp {
	public static void main(String[] args) {
		ArrayList<Person> listOfNames =new ArrayList<>();
		
		listOfNames.add(new Person("Ronald Kibet",27));
		
		listOfNames.add(new Person("Risper Jeptolo",25));
		listOfNames.add(new Person("Violah Jepkurgat",20));
		listOfNames.add(new Person("Maxmilah Jebungei",15));
		listOfNames.add(new Person("Leonard Kimutai",10));
		listOfNames.add(new Person("Arnold Kimutai",3));
		
		System.out.println("------------------------------------");
		System.out.println("List of Names Before Sort");
		System.out.println("------------------------------------");
		print(listOfNames);

		Collections.sort(listOfNames);
		System.out.println("------------------------------------");
		System.out.println("List of Names After Sort");
		System.out.println("------------------------------------");
		print(listOfNames);
		
	
	}
	static void print(ArrayList<Person> listOfNames) {
		
		for(Person person:listOfNames) {
			System.out.println("Name :"+person.name);
			System.out.println("Age :"+person.age);
		}
	}
	

}
