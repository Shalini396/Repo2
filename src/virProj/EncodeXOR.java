package virProj;
import java.io.*;
import java.util.*;

public class EncodeXOR {

	public static void main(String[] args) {
		int num=0;
		int a[] = {1,2,3}; //encoded array
		int first = 1; // first number of Original Array
		int b[] = new int[a.length+1];
		num = first;
		for(int i=0;i<a.length+1;i++) {
			if(i<a.length) {
				b[i] = num;
				num = a[i]^b[i];
			}else {
				b[i] = num;
			}
		}
		System.out.print(b);
		
		

	}

}
