import java.util.Arrays;

public class HeapImpl {


    public static void main(String[] args) {
        int[] inputArr = new int[] {4,5,2325,54,6,36,6,7};

        buildHeap(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }

    public static void buildHeap(int arr[]) {
        int N = arr.length;
        for(int i=(N/2)-1;i>=0;i--)
            heapify(arr, N, i);

        for(int i=N-1;i>0;i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int N, int i) {
        int largest = i;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;

        while(leftChild<N && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        while (rightChild < N && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if (largest!=i) {
            swap(arr, largest, i);
            heapify(arr, N, largest);
        }
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
