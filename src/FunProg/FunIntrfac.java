package FunProg;

public class FunIntrfac {
	
	public interface MyInterface {
	    public void run();
	}
	public interface MyInterface2 {
	    public void run();

	    public default void doIt() {
	        System.out.println("doing it");
	    }

	    public static void doItStatically() {
	        System.out.println("doing it statically");
	    }
	}
}