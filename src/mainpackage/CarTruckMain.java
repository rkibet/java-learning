package mainpackage;

public class CarTruckMain {
	public  static void main(String[] args) {
		
		CarTruck.Owner="Ronald Kibet";

		CarTruck cartrack =new CarTruck();
		cartrack.hasTruck=true;
		cartrack.MilesDrive=100;
		cartrack.Model=2010;
		cartrack.Price=23330;
		cartrack.Type="GSM";
		System.out.println("The Price of the Truck is:"+cartrack.GetPrice());
		
		
		
		cartrack.GetOwner();
		
		
		
		
	}

}
