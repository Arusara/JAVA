import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args) {

//        int inputArray[] = new int[]{1, 2, 3};

        int inputArray[] = new int[]{1,2,3,4,5,6};


        int i = 0;
        int j=inputArray.length-1;


        while(i<j) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(inputArray));
    }
}
