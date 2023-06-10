package Generics;

public class GenMethods {
	public static < T > void printGenericArray(T[] items) {  
        for ( T item : items){          
              System.out.print(item + " ");  
        }  
        System.out.println();  
   }  
   public static void main( String args[] )
   {  
       Integer[] int_Array = { 1, 3, 5, 7, 9, 11 };  
       Character[] char_Array = { 'A', 'M', 'U', 'T', 'H','A','S','H','A','L','I', 'N','I' };  

       System.out.println( "Integer Array contents:" );  
       printGenericArray(int_Array  );   

       System.out.println( "Character Array contents:" );  
       printGenericArray(char_Array );   
   }   
}
