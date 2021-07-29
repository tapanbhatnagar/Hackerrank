package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Round727A {

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
        int k = scanner.nextInt();
        while (k > 0) {
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            long t = scanner.nextLong();

            System.out.println(solve(n, x, t));
            k--;
        }
    }

    private static BigInteger solve(long n, long x, long t) {
        if (n == 1) return BigInteger.ZERO;

        BigInteger limit = BigInteger.valueOf((int)t/x);
        long lim = (int) t/x;
        return  (limit.multiply(BigInteger.valueOf(2*n - lim  -1))).divide(BigInteger.valueOf(2));
    }
}


