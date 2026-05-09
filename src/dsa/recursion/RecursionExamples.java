package dsa.recursion;

public class RecursionExamples {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    } 

    public static int binarySearch(int[] arr, int key) {
        return recBinarySearch(arr, key, 0, arr.length -1);
    }

    private static int recBinarySearch(int[] arr, int key, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return recBinarySearch(arr, key, low, mid-1);
        return recBinarySearch(arr, key, mid + 1, high);
    }
}
