package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
	
	        Queue<String> line  = new LinkedList<String>();
	        line.add("Mohi");
	        line.add("Arefin");
	        line.add("Zahid");

	        Iterator it = line.iterator();

	        while(it.hasNext()){
	            System.out.println(it.next());

	            }
	        System.out.print(line.peek());
	        System.out.println(line.remove("Arefin"));
	       
	        }

	}


