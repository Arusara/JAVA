
import java.util.Arrays;

public class BubbleSort {

	public static void main(String arg[]) {

		int a[] = new int[] {345,56,67,23,56};


		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {


			for(int j=i+1;j<a.length;j++) {

				if (a[i]>a[j]) {
					swap(a, i, j);
				}
			}
		}

		System.out.println(Arrays.toString(a));



	}

	public static void swap(int a[], int start, int end) {
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
	}
}