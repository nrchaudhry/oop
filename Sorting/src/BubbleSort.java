
public class BubbleSort {

	public static int[] sort(int[] arrd) {
		int n=arrd.length;
		int temp;

		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				if(arrd[j-1]>arrd[j]) {
					temp=arrd[j-1];
					arrd[j-1]=arrd[j];
					arrd[j]=temp;
				}
			}
		}	

		return arrd;
	}
}
