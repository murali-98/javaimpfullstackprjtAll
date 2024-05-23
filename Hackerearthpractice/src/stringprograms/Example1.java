package stringprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Map  items= new HashMap ();
		items.put(1,"pen");
		items.put(2,"pencil");
		//items.add("pencil");
		items.put(3,"paper");
		//for(String x :items)
		//{
			//System.out.print(x +" ");
			
		//}
		//items.forEach(System.out::println);
		for(int i=1;i<=items.size();i++) {
			System.out.println(items.get(i));
			
		}
		
		
	}

}
