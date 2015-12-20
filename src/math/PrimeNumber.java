package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
		 */
	//define limit
		int limit = 1000000;
		System.out.println("prime numbers are" + limit);
		
		for(int i =1;i<1000000;i++){
			boolean isPrime = true;
			
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				System.out.println(i);
			}
		}


    }

	}


