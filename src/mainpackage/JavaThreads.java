package mainpackage;

public class JavaThreads extends Thread {
	boolean isRunning=true;
//	static String Name;
	String Name;
	public JavaThreads(String Name) 
	{
		this.Name=Name;
		System.out.println(Name);
	}
	
@Override
public void run() {
display();
}
//synchronized static void display() 
 void display() {
	int count=0;
	while(count<10) {
		System.out.println(Name+"..."+count);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
	}
}
}
