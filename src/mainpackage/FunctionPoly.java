package mainpackage;

public class FunctionPoly {
	//function for division of double numbers
	double div(double n1,double n2) {
		double r=n1/n2;
		return r;
	}
	
	//function for division of integers
	double div(int n1,int n2) {
		double r=n1/n2;
		return r;
	}
	
	public static void main(String[] args) {
		
		double a =new FunctionPoly().div(90.0,20.0);
		System.out.println("Results :"+a);
		
	    a=new FunctionPoly().div(6,3);
		System.out.println("Results :"+a);
	}
}
