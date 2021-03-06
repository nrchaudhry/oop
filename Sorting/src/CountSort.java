
public class CountSort {

	public static int[] sort(int[] arr, int range) {
		int[] outputarr = new int[arr.length];
		int[] countarr = new int[range];

		//Step 1
		for (int i=0; i<arr.length; i++) {
			countarr[arr[i]] =  countarr[arr[i]] + 1;
		}
		
		//Step 2
		for (int i=1; i<countarr.length; i++) {
			countarr[i] = countarr[i-1] + countarr[i];
		}
		
		//Step 3
		for (int i=0; i<arr.length; i++) {
			outputarr[countarr[arr[i]]-1] = arr[i];
			countarr[arr[i]] = countarr[arr[i]] - 1;
		}
		
		return outputarr;
	}

	public static int[] sortforradix(int[] arr, int range, int count1) {
		int[] outputarr = new int[arr.length];
		int[] countarr = new int[range];
		
		//Step 1
		for (int i=0; i<arr.length; i++) {
			int index = arr[i]/count1;
			countarr[index%10] = countarr[index%10] + 1;
		}
		
		//Step 2
		for (int i=1; i<countarr.length; i++) {
			countarr[i] = countarr[i-1] + countarr[i];
		}
		
		//Step 3
		for (int i=arr.length-1; i>=0; i--) {
			int index = arr[i]/count1;
			outputarr[countarr[index%10]-1] = arr[i];
			countarr[index%10] = countarr[index%10] - 1;
		}
		
		return outputarr;
	}

}
