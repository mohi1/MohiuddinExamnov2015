package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		 List<String> list = new ArrayList<String>();
		    list.add("Hello!");
		    list.add("How are you?");
		    
		    list.remove(1);
		    list.get(0);

		    System.out.println(list.get(0)); 
		    for (String s : list) {
		        System.out.println(s);
		    } 

	}

}
