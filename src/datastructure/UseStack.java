package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> list = new Stack<String>();

        list.push("Mohi");
        list.push("arefin");
        list.push("Zahid");
        for (int i =0; i<=list.size()+1; i++){
            System.out.println(list.pop());
            System.out.println(list.peek());
            System.out.println(list.remove(1));
        }

    }
	}


