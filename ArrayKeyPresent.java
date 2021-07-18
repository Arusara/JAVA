/**
 *
 * https://www.geeksforgeeks.org/check-if-a-key-is-present-in-every-segment-of-size-k-in-an-array/
 *
 *
 */

public class ArrayKeyPresent {

    public static void main(String[] args) {

//        int[] inputArray = new int[] { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
//        int x =3;
//        int k = 3;
//int[] inputArray = new int[] { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25};
//
//        int x =23;
//       int k = 5;

        int[] inputArray = new int[]  { 5, 8, 7, 12, 14, 3, 9};

        int x = 8;
        int k = 2;



        System.out.println(keyPresent(inputArray, x, k));

    }

    public static boolean keyPresent(int inputArray[], int x, int k) {
        int i = 0;
        while (i<inputArray.length) {

            int j = i;
            boolean flag = false;
            while(j<i+k && j<inputArray.length) {
                if (inputArray[j]==x) {
                    flag = true;
                    break;
                }
                j++;
            }

            if (!flag) return false;

            i = i+k;

        }

        return true;

    }
}
