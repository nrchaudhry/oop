import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Sorting {
// Assignment
// 10000, 25000, 50000, 100000, 250000, 500000, 750000, 1000000
// Apply all sorting techniques 
	
	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		
//		GenerateDataset();
		
		int TotalDataFiles=0;
		File folder = new File("input");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        TotalDataFiles = TotalDataFiles + 1;
		    }
		}
		System.out.println("Total Files: "+TotalDataFiles);
		String[] sorting = {"Bubble Sort", "Count Sort", "Radix Sort"};
		Date date1, date2;
		int[][][] results = new int[TotalDataFiles][sorting.length][6];

		int fileIndex = -1;
		String line;
		for (File file : listOfFiles)  {
			BufferedReader bufferreader = new BufferedReader(new FileReader(file));
			List<Integer> data = new ArrayList<Integer>();

			while ((line = bufferreader.readLine()) != null) {
				data.add(Integer.parseInt(line));
			} 
			fileIndex = fileIndex + 1;
			System.out.println(file.getName()+ ": "+data.size());
			
			for (int i=0; i<sorting.length; i++) {
				System.out.println(sorting[i]);
				results[fileIndex][i][0] = data.size();
				for (int j=0; j<5; j++) {
					int[] arrdata = new int[data.size()];
					for (int k=0; k<data.size(); k++)
						arrdata[k] = data.get(k);
					
					date1 = new Date();
					if (sorting[i].compareTo("Bubble Sort") == 0)
						BubbleSort.sort(arrdata);
					else if (sorting[i].compareTo("Count Sort") == 0) 
						CountSort.sort(arrdata, data.size()*10);
					else if (sorting[i].compareTo("Radix Sort") == 0)
						RadixSort.sort(arrdata, data.size()*10);
					date2 = new Date();
	
					results[fileIndex][i][j+1] = (int) (date2.getTime() - date1.getTime());
				}
			}
		}
		
		FileWriter filewriter = new FileWriter(("results.csv"));
		filewriter.append("Data Size,Run #,");
		for (int j=0; j<sorting.length; j++)
			filewriter.append(sorting[j]+",");
		filewriter.append("\n");
		
		for (int i=0; i<TotalDataFiles; i++) {
			for (int k=1; k<6; k++) {
				filewriter.append(results[i][0][0]+","+k+",");
				for (int j=0; j<sorting.length; j++) {
					filewriter.append(results[i][j][k]+",");
				}
				filewriter.append("\n");
			}
		}
		filewriter.flush();
		filewriter.close();
		
//		FileWriter filewriter = new FileWriter(("results.csv"));
//		filewriter.append("Sorting Technique,");
//		for (int i=0; i<datasize.length; i++)
//			filewriter.append(datasize[i]+",");
//		filewriter.append("\n");
//
//		for (int s=0; s<sorting.length; s++) {
//			filewriter.append(sorting[s]+",");
//			for (int i=0; i<datasize.length; i++) {
//				int[] arr = new int[datasize[i]];
//				int[] sortarr = new int[datasize[i]];
//
//				FileWriter filewriterdatasort = new FileWriter((sorting[s]+"datasort"+datasize[i]+".csv"));
//				
//				
//				for (int j=0; j<5; j++) {
//					int[] arrdata = new int[datasize[i]];
//					for (int k=0; k<arr.length; k++)
//						arrdata[k] = arr[k];
//					date1 = new Date();
//					
////					if (sorting[s].compareTo("Bubble Sort") == 0)
//						sortarr = BubbleSort.sort(arrdata);
//						
////					else if (sorting[s].compareTo("Count Sort") == 0) 
////						sortarr = CountSort.sort(arr, datasize[i]*10);
////					else if (sorting[s].compareTo("Radix Sort") == 0)
////						sortarr = RadixSort.sort(arr, datasize[i]*10);
//	
//					date2 = new Date();
//					filewriter.append(date2.getTime() - date1.getTime()+",");
//				}
////				for (int j=0; j<arr.length; j++) {
////					System.out.print(arr[j]+", ");
////				}				
//				
//				for (int j=0; j<sortarr.length; j++) {
//					filewriterdatasort.append(sortarr[j]+"\n");
//				}
//				filewriterdatasort.flush();
//				filewriterdatasort.close();
//			}
//			filewriter.append("\n");
//		}		
//		
//		
//		filewriter.flush();
//		filewriter.close();
//
		
		
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
//	}
//		}
	}


	public static void GenerateDataset() throws IOException {
		int[] datasize = {10000, 25000, 50000, 100000, 250000, 500000, 750000, 1000000};
		Random rand = new Random();

		for (int i=0; i<datasize.length; i++) {
			FileWriter filewriterdata = new FileWriter(("data"+datasize[i]+".csv"));
			for (int j=0; j<datasize[i]; j++) {
				filewriterdata.append(rand.nextInt(datasize[i]*10)+"\n");
			}
			filewriterdata.flush();
			filewriterdata.close();
		}
	}
}
