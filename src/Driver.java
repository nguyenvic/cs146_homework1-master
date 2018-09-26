import java.util.Random;
public class Driver {

	public static void main(String[] args) {
		int array1[] = new int [20];
		int i = 20;									
		long startTime, endTime;
		double duration;
		//=============InsertionSort(Worst Case)==============
		for (int j = 0; j < array1.length; j++) 
		{
			
			array1[j] = i;
			i--;
		}
		
		System.out.printf("InsertionSort worst case array: \n");
		printArray(array1);

		startTime = System.nanoTime();
		sort.insertionSort(array1);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		printArray(array1);
		System.out.printf("\n\tWorst case result for insertionSort: %.5f milliseconds\n\n", duration/1000000);

		
		//=============InsertionSort(Best Case)==============
		
		for (int j = 0; j < array1.length; j++) 
		{
			
			array1[j] = j+1;
		}
		
		System.out.printf("InsertionSort best case array: \n");
		printArray(array1);
		startTime = System.nanoTime();
		sort.insertionSort(array1);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		printArray(array1);
		System.out.printf("\n\tBest case result for insertionSort: %.5f milliseconds\n\n", duration/1000000);

		
		//=============InsertionSort(Avg. Case)==============
		
		Random randomNum = new Random();
		for (int j = 0; j < array1.length; j++) 
		{
			
			array1[j] = randomNum.nextInt(1000);
		}
		
		System.out.printf("InsertionSort average case array: \n");
		printArray(array1);
		
		startTime = System.nanoTime();
		sort.insertionSort(array1);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		printArray(array1);
		System.out.printf("\n\tAverage case result for insertionSort: %.5f milliseconds\n\n", duration/1000000);
		
		//=============MergeSort(Worst Case)==============
		i = 20;
		for (int j = 0; j < array1.length; j++) 
		{
			
			array1[j] = i;
			i--;
		}
		
		System.out.printf("MergeSort worst case array: \n");
		printArray(array1);
		
		
		startTime = System.nanoTime();
		sort.mergeSort(array1, 0, array1.length - 1);		
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		printArray(array1);
		System.out.printf("\n\tWorst case result for MergeSort: %.5f milliseconds\n\n", duration/1000000);
		
		
		//=============MergeSort(Best Case)==============
		for (int j = 0; j < array1.length; j++) 
		{
			
			array1[j] = j+1;
		}
		
		System.out.printf("MergeSort best case array: \n");
		printArray(array1);
		startTime = System.nanoTime();
		sort.mergeSort(array1, 0, array1.length - 1);		
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		printArray(array1);
		System.out.printf("\n\tBest case result for MergeSort: %.5f milliseconds\n\n", duration/1000000);
		
		//=============MergeSort(Avg. Case)==============
		for (int j = 0; j < array1.length; j++) 
		{
			
			array1[j] = randomNum.nextInt(1000);
		}
		
		System.out.printf("MergeSort average case array: \n");
		printArray(array1);
		startTime = System.nanoTime();
		sort.mergeSort(array1, 0, array1.length - 1);		
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		printArray(array1);
		System.out.printf("\n\tAverage case result for MergeSort: %.5f milliseconds\n\n", duration/1000000);


	
	}
	
	public static void printArray(int arr[])
	{
		System.out.printf("\t");
		for (int k = 0; k < arr.length; k++)
		{
			System.out.printf("%d ", arr[k]);
		}
		System.out.println();
	}
	

}

