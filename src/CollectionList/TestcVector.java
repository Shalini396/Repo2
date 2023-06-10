package CollectionList;
import java.util.*;

public class TestcVector {
	public static void main(String args[]){  
		Vector<String> v=new Vector<String>();  
		v.add("Arivazhagan");  
		v.add("Amutha");  
		v.add("Shalini");  
		
		Iterator<String> itr2=v.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		}  
}
