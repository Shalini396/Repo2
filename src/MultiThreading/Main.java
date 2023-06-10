package MultiThreading;

public class Main {
	 public static void main(String[] args){
	        Thread t1 = new Thread(new MultiThread2(), "t1");
	        Thread t2 = new Thread(new MultiThread2(), "t2");
	        System.out.println("Starting Runnable threads");
	        t1.start();
	        t2.start();
	        System.out.println("Runnable Threads has been started");
	        Thread t3 = new MultiThread3("t3");
	        Thread t4 = new MultiThread3("t4");
	        System.out.println("Starting Threads");
	        t3.start();
	        t4.start();
	        System.out.println("Threads has been started");
	        
	    }

}
