package dsa.main;

import dsa.sorting.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 55, 12, 1, 66, 4, 2};

        ShellSort.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}