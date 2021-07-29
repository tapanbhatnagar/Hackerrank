package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Round731E {

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
        int x = scanner.nextInt();
        while (x > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = scanner.nextInt();
            }
            int[] t = new int[k];
            for (int i = 0; i < k; i++) {
                t[i] = scanner.nextInt();
            }
            solve(n, k, a, t);
            x--;
        }
    }

    private static void solve(int n, int k, int[] a, int[] t) {
        long[] t1 = new long[k];
        for (int i = 0; i < k; i++) {
            t1[i] = t[i] + a[i] - 1;
        }
        System.out.print(getMin(t1, k) + " ");
        for (int i = 1; i < n; i++) {
            long[] ti = new long[k];
            for (int j = 0; j < k; j++) {
                int count = (a[j] >= i + 1) ? -1 : 1;
                ti[j] = t1[j] + count;
            }
            t1 = ti;
            System.out.print(getMin(ti, k) + " ");
        }
        System.out.println();
    }

    private static long getMin(long[] arr, int k) {
        long min = 100000000000L;
        for (int i = 0; i < k; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }


}


