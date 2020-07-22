
public class RadixSort {

	public static int[] sort(int[] arr) {
		int[] outputarr = new int[10];
		int maximum = 0;
		
		// Find Maximum
		for (int i=0; i<arr.length; i++)
			if (maximum < arr[i])
				maximum = arr[i];
		System.out.println("\nMaximum: "+maximum);
		
		int count = 1;
		while (maximum/count > 0) {
			System.out.println("Loop for "+count);
			outputarr = CountSort.sortforradix(arr, 10, count);
			count = count * 10;
		}
		return outputarr;
	}
}
