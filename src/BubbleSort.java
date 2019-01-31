import java.util.Arrays;

public class BubbleSort {
	
	public static int[] bSort(int[] ar) {
		for (int i=0; i<ar.length; i++) {
			for (int j=0; j < ar.length-i-1; j++) {
				if (ar[j] > ar[j+1]) {
					int temp = ar[j+1];
					ar[j+1] = ar[j];
					ar[j] = temp;
				}
			}
		}
		return ar;
	}
	public static void main(String[] args) {
		int[] ar = {5,4,3,7,0,1};
		ar = bSort(ar);
		System.out.println(Arrays.toString(ar));
	}

}
