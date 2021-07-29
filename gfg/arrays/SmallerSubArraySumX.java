package gfg.arrays;

public class SmallerSubArraySumX {

    public static long sb(long a[], long n, long x) {
        // Your code goes here
        if (n == 0) return -1;
        int i = 0, j=0;
        long sum = a[0];
        int minLength = (int) n;
        while (i <= j && j < n) {
            if (sum <= x) {
                j++;
                if (j == n) break;
                sum += a[j];
            }else{
                if (minLength > j - i + 1) {
                    minLength = j - i + 1;
                }
                sum -= a[i];
                i++;
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        long[] a = {6, 3, 4, 5, 4, 3, 7, 9};
        long x = 16;
        System.out.println(sb(a, a.length, x));
    }
}
