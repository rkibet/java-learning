package mainpackage;

public class DeadLocks {
public static void main(String[] args) {
	final String Passenger1="Ronald Kibet";
	final String Passenger2="Gladys Jeruto";
	
	Thread bus1=new Thread() {
		@Override
		public void run(){
		synchronized (Passenger1) {
			System.out.println("Bus 1 is Locked Passenger 1");
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {
				
			}
			synchronized (Passenger2) {
				System.out.println("Bus 1 is Locked Passenger 2");
			}
			
		}
		}
		
	};
	//bus2
	Thread bus2=new Thread() {
		@Override
		public void run(){
		synchronized (Passenger2) {
			System.out.println("Bus 1 is Locked Passenger 2");
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {
				
			}
			synchronized (Passenger2) {
				System.out.println("Bus 1 is Locked Passenger 1");
			}
			
		}
		}
		
	};
	bus1.start();
	bus2.start();
	
}
}
