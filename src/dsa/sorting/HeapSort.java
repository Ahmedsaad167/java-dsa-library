package dsa.sorting;
import dsa.utils.ArrayUtils;
public class HeapSort {
    public static void sort(int[] arr) {
        int size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--) 
            trickleDown(arr, size, i);
        for (int i = size - 1; i > 0; i--) {
            ArrayUtils.swap(arr, 0, i);
            trickleDown(arr, i, 0);
        }
    }
    private static void trickleDown(int[] arr, int size, int index) {
        int top = arr[index];

        while (index < size / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            int largerChild;
            if (rightChild < size && arr[leftChild] < arr[rightChild])
                largerChild = rightChild;
            else
                largerChild = leftChild;
            if (top >= arr[largerChild])
                break;
            arr[index] = arr[largerChild];
            index = largerChild;
        }
        arr[index] = top;
    }
}
