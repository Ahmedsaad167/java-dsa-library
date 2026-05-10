package dsa.sorting;

public class MergeSort {
    public static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        recMergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void recMergeSort(int[] arr, int[] temp, int low, int high) {
        if (low >= high)
            return;

        int mid = low + (high - low) / 2;
        recMergeSort(arr, temp, low, mid);
        recMergeSort(arr, temp, mid + 1, high);
        merge(arr, temp, low, mid, high);
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        int leftPtr = low;
        int rightPtr = mid + 1;
        int index = low;

        while (leftPtr <= mid && rightPtr <= high) {
            if (arr[leftPtr] <= arr[rightPtr])
                temp[index++] = arr[leftPtr++];
            else
                temp[index++] = arr[rightPtr++];
        }

        while (leftPtr <= mid) 
            temp[index++] = arr[leftPtr++];

        while (rightPtr <= high)
            temp[index++] = arr[rightPtr++];

        for (int i = low; i <= high; i++)
            arr[i] = temp[i];
    }
}
