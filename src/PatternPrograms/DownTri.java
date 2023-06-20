package PatternPrograms;

public class DownTri {
	 void printPatternL(int n) {
		 int i,j;
		 for(i=n;i>0;i--) {
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
          DownTri obj = new DownTri();
          DownTri obj2 = new DownTri();
          obj.printPatternL(10);
          obj2.printPatternR(10);
	}

}
