package gfg.sorting;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        int len = arr.length;
        int swaps = 0;
        for (int i = 0; i < len - 1; i++) {
            int minIndx = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndx]) minIndx = j;
            }
            if (i != minIndx) {
                int temp = arr[i];
                arr[i] = arr[minIndx];
                arr[minIndx] = temp;
                swaps++;
            }
        }
        System.out.println(swaps);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                1, 4, 9, 0, 9, 6, 8, 0, 8, 9
        };
        int[] sortedArr = sort(arr);
        for (int j : sortedArr) {
            System.out.println(j);
        }
    }
}
