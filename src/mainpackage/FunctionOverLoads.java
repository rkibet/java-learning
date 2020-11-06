package mainpackage;

public class FunctionOverLoads {
	//function with two parameters
float sub (float number1,float number2) {
	float results=number1-number2;
	return results;
}

//function with three parameters
float sub (float number1,float number2,float number3) {
	float results=number1-number2-number3;
	return results;
}
public static void main(String[] args) {
	//output the answer of two parameters
	float r=new FunctionOverLoads().sub(8,4);
	System.out.println("The Answer :"+r);
	
	//output the answer of two parameters
	float r1=new FunctionOverLoads().sub(8, 2,14);
	System.out.println("The Answer :"+r1);
}
}
