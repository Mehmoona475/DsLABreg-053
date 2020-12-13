/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort2;

/**
 *
 * @author Memoona
 */
public class Bubble_sort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int arr[] ={12,98,34,11};  
 
		System.out.println("---Array Before Bubble Sort---"); 
		
	    printArray(arr);
 
		bubblesort(arr); 
 
		System.out.println("---Array After Bubble Sort---");  
		
		printArray(arr); 
    }
        static   public void bubblesort(int[] arr){
    
    int n= arr.length;
    int temp;
    for(int i=0; i < n-1; i++)
		{  
                    System.out.println(" sort pass number :"+(i+1));
			for(int j=0; j < n-1-i; j++){
                           // System.out.println("  sort pass "+(i+1));
				if(arr[j] > arr[j+1])
				{   
				    
				
					temp = arr[j];  
					arr[j] = arr[j+1];  
					arr[j+1] = temp;
                                        
					printArray(arr);
    
    
                                }
                             
      
                        }
                }
}
  static   void printArray(int[] array){
      int i=0;
	int n=array.length;     
	    for(i=0; i < n-1; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
            
	}
 
    

    
         
    }
   
    

