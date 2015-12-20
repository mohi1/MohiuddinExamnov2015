package algorithm;

public class Sort {

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        int [] list = array;
        {
            int i, j, first, temp;  
            for ( i = array.length - 1; i > 0; i-- )  
            {
                 first = 0;   
                 for(j = 1; j <= i; j ++)   
                 {
                      if( array[ j ] < array[ first ] )         
                        first = j;
                 }
                 temp = array[ first ];   
                 array[ first ] = array[ i ];
                 array[ i ] = temp; 
             }           
       }
      

        return list;
    }

    public int[] insertionSort(int [] array){
        int [] list = array;
        {
            int j;                    
            int key;           
            int i;  

            for (j = 1; j < array.length; j++)   
           {
                  key = array[ j ];
                  for(i = j - 1; (i >= 0) && (array[ i ] < key); i--)   
                 {
                        array[ i+1 ] = array[ i ];
                 }
                array[ i+1 ] = key;    
            }
       }
       
        
        
        
        
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        {
            int j;
            boolean flag = true;  
            int temp;   

            while ( flag )
            {
                   flag= false;    
                   for( j=0;  j < array.length -1;  j++ )
                   {
                          if ( array[ j ] < array[j+1] )  
                          {
                                  temp = array[ j ];            
                                  array[ j ] = array[ j+1 ];
                                  array[ j+1 ] = temp;
                                 flag = true;              
                         } 
                   } 
             } 
       } 
        
        
        
        
        
        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        
        
        
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}