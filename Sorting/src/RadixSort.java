
public class RadixSort {

	public static int[] sort(int[] arr, int range) {
		int[] outputarr = new int[arr.length];
		int maximum = 0;
		
		// Find Maximum
		for (int i=0; i<arr.length; i++)
			if (maximum < arr[i])
				maximum = arr[i];
		
		int count = 1;
		while (maximum/count > 0) {
			outputarr = CountSort.sortforradix(arr, range, count);
			count = count * 10;
		}
		return outputarr;
	}
}
