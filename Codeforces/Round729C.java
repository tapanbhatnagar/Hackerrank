package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Round729C {

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
            String s = scanner.next();
            BigInteger n = new BigInteger(s);

            solve(n);
            t--;
        }
    }

    private static void solve(BigInteger n) {
        BigInteger ans;
//        int[] arr = new int[]{
//                26, 28, 28, 27, 28, 30
//        };
        int[] arr2 = new int[]{
                2, 3, 2, 3, 2, 4, 2, 3, 2, 3, 2, 5, 2, 3, 2, 3, 2, 4, 2, 3, 2, 3, 2, 5, 2, 3, 2, 3, 2, 4, 2, 3, 2, 3, 2, 5, 2, 3, 2, 3, 2, 4, 2, 3, 2, 3, 2, 5, 2, 3, 2, 3, 2, 4, 2, 3, 2, 3, 2, 7,
        };
        BigInteger ques = n.divide(BigInteger.valueOf(60));
        int rem = n.mod(BigInteger.valueOf(60)).intValue();
        int ans2 = 0;
        for (int i = 0; i < rem; i++) {
            ans2 += arr2[i];
        }
        ans = ques.multiply(BigInteger.valueOf(167));
        ans = ans.add(BigInteger.valueOf(ans2));
        System.out.println(ans.mod(BigInteger.valueOf(1000000007)));
    }

}


