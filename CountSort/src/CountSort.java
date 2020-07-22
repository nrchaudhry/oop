import java.util.Random;

public class CountSort {

	
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rand = new Random();
		
		System.out.print("Unsorted Array: ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(5);
			System.out.print(arr[i]+", ");
		}
		
		int[] sortarr = sort(arr);
		
		System.out.println("");
		System.out.print("Sorted Array: ");
		for (int i=0; i<sortarr.length; i++) {
			System.out.print(sortarr[i]+", ");
		}
		
		
	}

	public static int[] sort(int[] arr) {
		int[] outputarr = new int[10];
		int[] countarr = new int[5];
		
		System.out.println("\n\n");
		System.out.print("Before Count Array: ");
		for (int i=0; i<countarr.length; i++) {
			System.out.print(countarr[i]+", ");
		}
		
		//Step 1
		for (int i=0; i<arr.length; i++) {
			countarr[arr[i]] =  countarr[arr[i]] + 1;
		}
		
		System.out.println("\n");
		System.out.print("After Count Array: \n");
		for (int i=0; i<countarr.length; i++) {
			System.out.println(i+"\t"+countarr[i]+", ");
		}
		
		//Step 2
		for (int i=1; i<countarr.length; i++) {
			countarr[i] = countarr[i-1] + countarr[i];
		}
		
		System.out.println("\n");
		System.out.print("After Count Addition Array: \n");
		for (int i=0; i<countarr.length; i++) {
			System.out.println(i+"\t"+countarr[i]+", ");
		}
		
		//Step 3
		for (int i=0; i<arr.length; i++) {
			outputarr[countarr[arr[i]]-1] = arr[i];
			countarr[arr[i]] = countarr[arr[i]] - 1;
		}
		
		return outputarr;
	}
}
