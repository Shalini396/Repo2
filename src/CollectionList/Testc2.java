package CollectionList;
import java.util.*;

public class Testc2 {
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ammu");  
		al.add("Shalu");  
		al.add("Manish");  
		al.add("Pk");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
