package mainpackage;

public class JavaRunnable implements Runnable{
	boolean isRunning=true;
	String Name;
	public JavaRunnable(String Name) 
	{
		this.Name=Name;
		System.out.println(Name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
		while(isRunning) {
			System.out.println(Name+":"+count);
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
