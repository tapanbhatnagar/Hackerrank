package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Round728A {

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
            solve(n);
            if (t != 1) {
                System.out.println();
            }
            t--;
        }
    }

    private static void solve(int n) {
        if (n % 2 == 0) {
            for (int i = 1; i < n + 1; i++) {
                if (i % 2 == 0) {
                    System.out.print((i - 1) + " ");
                } else System.out.print((i + 1) + " ");
            }
        } else {
            for (int i = 1; i < n - 1; i++) {
                if (i % 2 == 0) {
                    System.out.print((i - 1) + " ");
                } else System.out.print((i + 1) + " ");
            }
            System.out.print(n + " ");
            System.out.print(n - 2);
        }
    }

}


