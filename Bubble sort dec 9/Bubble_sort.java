/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;

/**
 *
 * @author Memoona
 */
public class Bubble_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int arr[] ={12,98,34,11};  
 
		System.out.println("---Array Before Bubble Sort---"); 
		
	    printArray(arr);
 
		bubblesort(arr); 
 
		System.out.println("---Array After Bubble Sort---");  
		
		printArray(arr); 
    }
        static   public void bubblesort(int[] arr){
    
    int len= arr.length;
    int temp;
    for(int i=0; i < len; i++)
		{  
                    System.out.println(" sort pass number :"+(i+1));
			for(int j=1; j < (len-i); j++){
                           // System.out.println("  sort pass "+(i+1));
				if(arr[j-1] > arr[j])
				{   
				    
				
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;
                                        
					printArray(arr);
    
    
                                }
                             
      
                        }
                }
}
  static   void printArray(int[] array){
      int i=0;
	     
	    for(i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
            
	}
 
    

    
         
    }
    

