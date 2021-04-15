import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


public class TestSelectionSort extends TestCase{
	@Test public void test() {
		//testPositive();
		//testNegative();
		testMixed();
		testDuplicates();
		}    
	//public TestSelectionSort() { }    
	
	public void testPositive(){   
		SelectionSort obj = new SelectionSort();
		int[] arr = new int[5];        
		arr[0] = 8;        
		arr[1] = 9;        
		arr[2] = 7;        
		arr[3] = 10;        
		arr[4] = 2;        
		int[] Sortedarr = new int[5];        
		Sortedarr[0] = 2;        
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;  
		Sortedarr[3] = 9;     
		Sortedarr[4] = 10; 
		/** add tests to check for this unit test **/
		int[] newSortArr = obj.basicSelectionSort(arr);
		for(int i = 0; i < arr.length-1; i++)
			assert newSortArr[i] == Sortedarr[i];
	}    
	
	public void testNegative(){      
		SelectionSort obj = new SelectionSort();
		/** Test data contains negative values only **/    
		int[] arr = new int[5];        
		arr[0] = -8;        
		arr[1] = -9;        
		arr[2] = -7;        
		arr[3] = -10;        
		arr[4] = -2;        
		int[] Sortedarr = new int[5];        
		Sortedarr[4] = -2;        
		Sortedarr[3] = -7;
		Sortedarr[2] = -8;  
		Sortedarr[1] = -9;     
		Sortedarr[0] = -10;
		
		int[] newSortArr = obj.basicSelectionSort(arr);
		for(int i = 0; i < arr.length-1; i++)
			assert newSortArr[i] == Sortedarr[i];
	}
	
	public void testMixed(){
		SelectionSort obj = new SelectionSort();
    /** Test data contains with both positive, negative and zeros **/
		int[] arr = new int[5];        
		arr[0] = -8;        
		arr[1] = 9;        
		arr[2] = 7;        
		arr[3] = -10;        
		arr[4] = -2;        
		int[] Sortedarr = new int[5];        
		Sortedarr[2] = -2;        
		Sortedarr[3] = 7;
		Sortedarr[1] = -8;  
		Sortedarr[4] = 9;     
		Sortedarr[0] = -10;
		
		int[] newSortArr = obj.basicSelectionSort(arr);
		for(int i = 0; i < arr.length-1; i++)
			assert newSortArr[i] == Sortedarr[i];
		}    
	
	public void testDuplicates(){   
		SelectionSort obj = new SelectionSort();
		/** Test data contains duplicates **/
		int[] arr = new int[6];        
		arr[0] = 8;        
		arr[1] = 9;        
		arr[2] = 10;        
		arr[3] = 10;        
		arr[4] = 2;       
		arr[5] = 8;
		int[] Sortedarr = new int[6];        
		Sortedarr[0] = 2;        
		Sortedarr[1] = 8;
		Sortedarr[2] = 8;  
		Sortedarr[3] = 9;     
		Sortedarr[4] = 10;
		Sortedarr[5] = 10;
		
		int[] newSortArr = obj.basicSelectionSort(arr);
		for(int i = 0; i < arr.length-1; i++)
			assert newSortArr[i] == Sortedarr[i];
		
	}
	
}

