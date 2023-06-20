package PatternPrograms;

public class Pyramid {
	void printPattern(int n) {
		int i,j;
		for(i=0;i<n;i++) {
			for(j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramid obj = new Pyramid();
		obj.printPattern(10);
		

	}

}
