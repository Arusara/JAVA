import java.util.Arrays;

public class RotateArrayRecursive {

    public static void main(String[] args) {
        int[] inputArray = {6,5,4,3,2,1};
        reverseArray(inputArray, 0, inputArray.length-1);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void reverseArray(int inputArray[], int start,int end) {
        // base condition.
        if (start>=end) return;

        int temp = inputArray[start];
        inputArray[start] = inputArray[end];
        inputArray[end] = temp;
        reverseArray(inputArray, start+1, end-1);

    }
}
