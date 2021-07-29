package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Round728B {

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
        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            if (2 * i + 1 >= arr[i-1]) {
                for (int j = i+1; j <= n; j++) {
                    if ((arr[j - 1] * arr[i - 1]) == (i + j)) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}


