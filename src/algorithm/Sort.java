package algorithm;

public class Sort {

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        int [] list = array;
        int temp;
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++) {
                if (list[i] > list[j]) {
                    temp=list[j];
                    list[j]=list[i];
                    list[i]=temp;
                }
            }
        }

        return list;
    }

    public int[] insertionSort(int [] array){
        int [] list = array;
       
        
        
        
        
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        
        
        
        
        
        
        
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