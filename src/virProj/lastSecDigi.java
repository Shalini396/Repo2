package virProj;
import java.util.*;

public class lastSecDigi {

   int input1 = 197;
   if(input1<0) {
	   input1 = (-1)*input1;
   }
   int c=0;
   int l = Integer.toString(input1).length();
   int r=0;
   if(l==1) {
	   System.out.println("-1");
   }
   else {
	   while(input1>0) {
		   r=input1%10;
		   c++;
		   input1 = input1/10;
		   if(c==2) {
			   break;
		   }
		   System.out.println(r);
	   }
   }
   
   
}
