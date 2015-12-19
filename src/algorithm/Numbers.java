package algorithm;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm use by applying into (num array). 
	 * Display the execution time for each sorting. 
	 */

	public static void main(String[] args) {
		
		final long startTime = System.currentTimeMillis();
		
		int [] num = new int[100000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(1000000);
			
		}

		//Example for Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		
		
		
		System.out.println("...............after sorting............");
		for(int i=0; i<num.length; i++){
			
			System.out.println(num[i]);
				
			}

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		System.out.println("Total Execution Time : " + executionTime + " milli sec");
	}

}
