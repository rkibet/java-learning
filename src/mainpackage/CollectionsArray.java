package mainpackage;

import java.util.ArrayList;

public class CollectionsArray {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Developer");
		ar.add("Supervisor");
		ar.add("Tester");
		ar.add("Support");
		ar.add("Technician");
		ar.add("Liason");
//		ar.remove(0);
		for(String st:ar) 
		{
		System.out.println(st);
		}
		
		//Array Class
		ArrayList<employee> emp=new ArrayList<employee> ();
		emp.add(new employee("Ronald Kibet",27));
		emp.add(new employee("Shadrack Mwangi",26));
		emp.add(new employee("Emmanuel Kibet",29));
		emp.add(new employee("Sheila Musani",28));
		emp.add(new employee("Stellah Wahirimu",30));
		emp.add(new employee("Charles Munene",20));
		for(employee st:emp) {
			System.out.println(st.Name);
		}
	}
static class employee{
	String Name;
	int Age;
	public employee(String Name,int Age) {
	this.Age=Age;
	this.Name=Name;
	}
	
}
}
