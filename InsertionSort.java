import java.util.Arrays;

public class InsertionSort {

	public static void main(String arg[]) {


		int a[] = new int[]{84,45,2,1,10};



		for(int i=1;i<a.length;i++) {

			int key = a[i];

			int j = i-1;


			while(j>=0 && key<a[j]) {
				a[j+1] = a[j];
				j--;
			}

			a[j+1] = key;
		}

		System.out.println(Arrays.toString(a));

	}
}