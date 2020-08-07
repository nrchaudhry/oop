import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Random;

public class Sorting {
// Assignment
// 10000, 25000, 50000, 100000, 250000, 500000, 750000, 1000000
// Apply all sorting techniques 
	
	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		
		String[] sorting = {"Bubble Sort", "Count Sort", "Radix Sort"};
		int[] datasize = {10000, 25000, 50000, 100000};//, 250000, 500000, 750000, 1000000};
		Date date1, date2;
		
		FileWriter filewriter = new FileWriter(("results.csv"));
		filewriter.append("Sorting Technique,");
		for (int i=0; i<datasize.length; i++)
			filewriter.append(datasize[i]+",");
		filewriter.append("\n");

		for (int s=0; s<sorting.length; s++) {
			filewriter.append(sorting[s]+",");
			Random rand = new Random();
			for (int i=0; i<datasize.length; i++) {
				int[] arr = new int[datasize[i]];
				int[] sortarr = new int[datasize[i]];

				FileWriter filewriterdata = new FileWriter((sorting[s]+"data"+datasize[i]+".csv"));
				FileWriter filewriterdatasort = new FileWriter((sorting[s]+"datasort"+datasize[i]+".csv"));
				
				for (int j=0; j<arr.length; j++) {
					arr[j] = rand.nextInt(datasize[i]*10);
					filewriterdata.append(arr[j]+"\n");
				}
				filewriterdata.flush();
				filewriterdata.close();
				
				date1 = new Date();
				if (sorting[s].compareTo("Bubble Sort") == 0)
					sortarr = BubbleSort.sort(arr);
				else if (sorting[s].compareTo("Count Sort") == 0) 
					sortarr = CountSort.sort(arr, datasize[i]*10);
				else if (sorting[s].compareTo("Radix Sort") == 0)
					sortarr = RadixSort.sort(arr, datasize[i]*10);

				date2 = new Date();
				filewriter.append(date2.getTime() - date1.getTime()+",");
				
				
				for (int j=0; j<sortarr.length; j++) {
					filewriterdatasort.append(sortarr[j]+"\n");
				}
				filewriterdatasort.flush();
				filewriterdatasort.close();
			}
			filewriter.append("\n");
		}		
		
		
		filewriter.flush();
		filewriter.close();

		
		
//		int[] sortarr = CountSort.sort(arr, 5);
//		int[] sortarr = RadixSort.sort(arr);

//		Date date1 = new Date();
//		int[] sortarr = BubbleSort.sort(arr);
//		Date date2 = new Date();
//
//		System.out.println("");
//		System.out.print("Sorted Array: ");
//		for (int i=0; i<sortarr.length; i++) {
//			System.out.print(sortarr[i]+", ");
//		}
//		long difference = date2.getTime() - date1.getTime(); 
//		System.out.print("\n\nTime Difference: "+difference);
//
	}

}
