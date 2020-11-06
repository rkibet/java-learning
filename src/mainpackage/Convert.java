package mainpackage;

public class Convert {
	public static void main(String[] args ) {
		int age=27;
		double salary =3.5;
		boolean isTrue =true;
		String rate="33.55";
		float pi=3.32f;
		
		//convert to String
		String newAge =String.valueOf(age);
		String newSalary=String.valueOf(salary);
		String newIstrue=String.valueOf(isTrue);
		
		//convert to Integer
		int newRate =Integer.parseInt(rate);
		int newsalary =(int)salary;
		
		//covert to Double

		double newrate = (double)pi;

		
		
		System.out.println("_____________");
	}

}
