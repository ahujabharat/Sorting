import java.util.Arrays;

public class NewSort {
	public static void sort(int[] arr) {
	        int n = arr.length; 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            int min = i; 
	            for (int j = i+1; j < n; j++) 
	                if (arr[j] < arr[min]) 
	                    min = j; 
	            int temp = arr[min]; 
	            arr[min] = arr[i]; 
	            arr[i] = temp; 
	        }
	}
	public static void main(String[] args) {
		int[] ar = {7,10,2,3,4,1,0};
		sort(ar);
		System.out.println(Arrays.toString(ar));
	}

}
