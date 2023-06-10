package CollectionList;

import java.util.*;
public class Testc1 {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Shalini");//Adding object in arraylist  
		list.add("Faiza");  
		list.add("Anala");  
		list.add("Vikashini");  
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
}
}
