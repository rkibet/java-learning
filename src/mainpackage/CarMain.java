package mainpackage;

public class CarMain {
public static void main(String[] args) {
	Car car1 =new Car();
	car1.Type="BMW";
	car1.Model=2010;
	car1.Price=10000;
	car1.MilesDrive=5;
	double price=car1.GetPrice();
	System.out.println("The Price of the Car :"+price);
	
}
}
