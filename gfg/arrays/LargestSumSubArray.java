package gfg.arrays;

public class LargestSumSubArray {

    // Kadane's algorithm
    private int getLargestSumSubArray(int[] arr) {
        int maxSum = 0, maxSoFar = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSoFar+= arr[i];
            // add the elem if you want the subarray
            if (maxSum < maxSoFar) maxSum = maxSoFar;
            if (maxSoFar < 0) maxSoFar = 0;
        }
        return maxSum;
    }

}
