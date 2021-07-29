package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Round726C {

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            try {
                while (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
            } catch (Exception e) {
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            solve(arr, n);
            t--;
        }
    }

    private static void solve(int[] arr, int n) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int lowerIndx = -1;
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i+1] - arr[i];
            if (minDiff > diff) {
                minDiff = diff;
                lowerIndx = i;
            }
        }
        if (lowerIndx >= 0) {
            System.out.print(arr[lowerIndx]+" ");
            for (int i = lowerIndx+2; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < lowerIndx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[lowerIndx+1]);
        }
    }

}
