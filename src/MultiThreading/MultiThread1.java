package MultiThreading;

public class MultiThread1 implements Runnable {
	public static void main(String[] args) {
        Thread sThread1 = new Thread("Thread1");
        Thread sThread2 = new Thread("Thread2");
        sThread1.start();
        sThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(sThread1.getName());
        System.out.println(sThread2.getName());
    }
    @Override
    public void run() {
    }
}
