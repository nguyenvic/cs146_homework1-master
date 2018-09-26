public class sort {

	public static void insertionSort(int array[])
	{
		int key, i;
		for (int j = 1; j < array.length; j++)
		{
			key = array[j];
			i = j - 1;
			while (i >= 0 && array[i] > key)
			{
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i+1] = key;
		}
	}
	
	public static void mergeSort(int array[], int left, int right)
	{
		int mid;
		if (left < right)
		{
			mid = (left+(right-1))/2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}

	public static void merge(int array[], int left, int mid, int right)
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int L[] = new int[n1+1];
		int R[] = new int[n2+1];
		int i;
		int j;
		for (i = 0; i < n1; i++)
		{
			L[i] = array[left + i];
		}
		for (j = 0; j < n2; j++)
		{
			R[j] = array[mid + j + 1];
		}
		L[n1] = 9999;
		R[n2] = 9999;

		i = 0;
		j = 0;
		
		for (int k = left; k <= right; k++)
		{
			if (L[i] <= R[j])
			{
				array[k] = L[i];
				i = i + 1;
			}
			else
			{
				array[k] = R[j];
				j = j + 1;
			}
		}
	}
	
}
