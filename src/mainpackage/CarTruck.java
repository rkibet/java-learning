package mainpackage;

public class CarTruck extends Car {
	
	boolean hasTruck;
	
	void GetOwner() {
		System.out.println("The Car Owner :"+Owner);
	}
	public CarTruck() {
		System.out.println(" The CarTruck Constractor Has Been Created");
		
		System.out.println("The Price of the Truck is:"+GetPrice());
	}
	@Override
	double GetPrice() 
	{
		double NewPrice =Price-(MilesDrive*50);
		return NewPrice;
	}
}
