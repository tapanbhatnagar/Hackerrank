package gfg.sorting;

class BubbleSort {

    public static int[] sort(int[] arr, int len) {
        if (len == 0 || arr == null) return arr;
        // first n then n-1, n-2 ..... so on
        // TC: worst case when sorted in opp order:
        // n*(n-1)/2  = O(n2)
        for (int k = 1; k < len; k++) {
            int flag = 0;
            for (int i = 0; i < len - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
               100 , 0, 0, 1, 4, 6, 8, 8, 9, 9, 9, 100
        };
        int len = arr.length;
        sort(arr, len);
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}
