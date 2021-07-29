package gfg.arrays;

public class trappingRainWater {

    static int trappingWater(int arr[], int n) {

        // Your code here
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)  max = arr[i];
            else sum += max - arr[i];
        }
        return  sum;
    }

    public static void main(String[] args) {
        int[] arr = {6,9,9};
        System.out.println(trappingWater(arr, arr.length));
    }
}
