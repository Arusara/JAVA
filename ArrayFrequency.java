public class ArrayFrequency {


    public static void main(String[] args) {


        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int x = 5;


        // Time complexcity O(n);
        int result = 0;
        for (int i=0;i<arr.length;i++) {

            if (arr[i]==x) result++;
        }
        System.out.println("result: "+result);
    }
}
