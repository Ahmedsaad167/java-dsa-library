package dsa.sorting;

public class ShellSort {

    public static void sort(int[] arr) {
        int temp;
        int h = 1;
        int n = arr.length;

        while (h < n/3)
            h = 3*h + 1;
        
        while (h > 0) {
            for (int i = h; i < n; i++) {
                temp = arr[i];
                int j = i;

                while (j >= h && arr[j-h] >= temp) {
                    arr[j] = arr[j-h];
                    j -= h;
                }
                arr[j] = temp;
            }
            h = (h-1) / 3;
        }
    }
}