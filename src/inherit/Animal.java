package inherit;

class cat {
       void walk() {
    	   System.out.println("I can Walk");
       }
}
class Bird extends cat{
	void fly() {
		System.out.println("I can fly");
	}
}
public class Animal{
	public static void main(String args[]) {
	Bird b = new Bird();
	b.walk();
	b.fly();
 }
}
