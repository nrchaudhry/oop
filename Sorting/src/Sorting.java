import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Random rand = new Random();
		
		System.out.print("Unsorted Array: ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(1000);
			System.out.print(arr[i]+", ");
		}
		
//		int[] sortarr = CountSort.sort(arr, 5);
		int[] sortarr = RadixSort.sort(arr);
		
		System.out.println("");
		System.out.print("Sorted Array: ");
		for (int i=0; i<sortarr.length; i++) {
			System.out.print(sortarr[i]+", ");
		}
		

	}

}
