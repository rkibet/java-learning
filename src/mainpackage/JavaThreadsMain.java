package mainpackage;

public class JavaThreadsMain {

	public static void main(String[] args) throws InterruptedException {
		JavaThreads t1 = new JavaThreads("Thread---1..");
		t1.start();
		t1.join();
		JavaThreads t2 = new JavaThreads("Thread---2..");
		t2.start();
		System.out.println("The Thread Is Working");
		Thread.sleep(6000);
		t1.isRunning=false;
		
//		JavaRunnable r = new JavaRunnable("Runnable");
//		Thread tr = new Thread(r);
//		tr.start();
	}
}
