/**
 *
 *
 * https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/
 */

public class ArrayFindMinMax {

    public static void main(String[] args) {

        int inputArr[] = { 12, 1234, 45, 67, 1 };

        // Time Complexcity o(n/2)

        int N = inputArr.length/2;
        int j = inputArr.length-1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i=0;i<=N;i++) {
            min = Math.min(Math.min(min, inputArr[i]), inputArr[j]);
            max = Math.max(Math.max(max, inputArr[i]), inputArr[j]);

        }

        System.out.println("minimum element: "+min);
        System.out.println("maximum element: "+max);

    }


}
