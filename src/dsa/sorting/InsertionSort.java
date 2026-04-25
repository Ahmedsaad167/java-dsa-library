package dsa.sorting;

public class InsertionSort {
    public static void sort(int[] arr) {
        int j, temp;
        for (int i =1;i < arr.length;i++) {
            j = i;
            temp = arr[j];
            while (j > 0 && temp <= arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
