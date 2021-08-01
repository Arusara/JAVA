
import java.util.Arrays;

public class SelectionSort {


	public static void main(String arg[]) {


		int a[]= new int[]{64,25,12,22,11};


		for(int i=0;i<a.length;i++) {

			int min = i;

			for(int j=i+1;j<a.length;j++) {
				if (a[j]<a[min]) min = j;
			}

			swap(a, i, min);

		}

		System.out.println(Arrays.toString(a));

	}


	public static void swap(int a[], int first, int second) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}


}