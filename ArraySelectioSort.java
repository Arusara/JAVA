import java.util.Arrays;

public class ArraySelectioSort {

    public static void main(String[] args) {

        int[] inputArr = new int[] {6,6,5,4,3,2,1};
        int N = inputArr.length;
        for (int i=0;i<N;i++) {

            int minIndex = i;
            for (int j=i+1;j<N;j++) {
                if (inputArr[j]<inputArr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(inputArr, i, minIndex);
        }
        System.out.println(Arrays.toString(inputArr));
    }

    public static void swap(int[] inputArr, int i, int j) {
        int temp = inputArr[i];
        inputArr[i] = inputArr[j];
        inputArr[j] = temp;
        return;
    }
}
