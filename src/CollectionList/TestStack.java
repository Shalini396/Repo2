package CollectionList;
import java.util.*;

public class TestStack {
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("27");  
		stack.push("28");  
		stack.push("29");  
		stack.push("30");  
		stack.push("31");  
		stack.pop();  
		Iterator<String> itr1=stack.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		}  

}
