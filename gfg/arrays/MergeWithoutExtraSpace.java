package gfg.arrays;

import java.util.Arrays;

public class MergeWithoutExtraSpace {


    // put all small elem in first arr and all large in second
    // compare using 2 pointers and if first < second keep going
    // else swap last of arr1 and arr2[j](smaller elem) so that all small elem in second get
    // swapped with large in  first
    static void merge(int[] arr1, int[] arr2, int n, int m) {
        // code here
        int i = 0;
        int j = 0;
        int k = n-1;
        while(i < n &&  j < m && i <= k) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int a = 0; a < n; a++) {
            System.out.println(arr1[a]);
        }
        for (int b = 0; b < m; b++) {
            System.out.println(arr2[b]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1, arr2, arr1.length, arr2.length);

    }

}
