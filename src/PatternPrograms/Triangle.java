package PatternPrograms;

public class Triangle {
	void printPatternL(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	void printPatternR(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj = new Triangle();
		Triangle obj2 = new Triangle();
		obj.printPatternL(10);
		obj2.printPatternR(10);
		

	}

}
