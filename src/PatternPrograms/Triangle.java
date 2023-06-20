package PatternPrograms;

public class Triangle {
	void printPattern(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj = new Triangle();
		obj.printPattern(10);
		

	}

}
