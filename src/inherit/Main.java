package inherit;
//Single and Multilevel Inheritance
public class Main {

	public static void main(String[] args) {
		mouse1 m1 = new mouse1();
		mouse2 m2 = new mouse2();
		m1.setColor("White");
		m1.mousetype("Gaming Mouse");
		m1.leftClick();
		m1.rightClick();
		m2.connect("Bluetooth");

	}

}
