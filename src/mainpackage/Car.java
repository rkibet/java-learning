package mainpackage;

public class Car {
	String Type;
	int Model;
	double Price;
	double MilesDrive;
	static String Owner;
	public Car() 
	{
		System.out.println("Constractor Created");
	}
	
	double GetPrice() 
	{
		double NewPrice =Price-(MilesDrive*100);
		return NewPrice;
	}

}
