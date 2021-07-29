package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Round725A {

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
        if (n == 3 || n == 2) {
            System.out.println(2);
            return;
        }
        int minIndx = 0;
        int maxIndx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[minIndx]) {
                minIndx = i;
            }
            if (arr[i] > arr[maxIndx]) {
                maxIndx = i;
            }
        }
        int mid = n / 2;
        int ans;
        if (minIndx <= mid && maxIndx <= mid) {
            ans = Math.max(minIndx, maxIndx) + 1;
        } else if (minIndx >= mid && maxIndx >= mid) {
            ans = Math.max(n - minIndx, n - maxIndx);
        } else {
            if (minIndx > maxIndx) {
                ans = maxIndx + n - minIndx + 1;
            } else {
                ans = minIndx + n - maxIndx + 1;
            }
        }
        System.out.println(ans);
    }

}
