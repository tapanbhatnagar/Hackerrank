package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Round731A {

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
            int xa = scanner.nextInt();
            int ya = scanner.nextInt();

            int xb = scanner.nextInt();
            int yb = scanner.nextInt();

            int xf = scanner.nextInt();
            int yf = scanner.nextInt();

            solve(xa, ya, xb, yb, xf, yf);
            t--;
        }
    }

    private static void solve(int xa, int ya, int xb, int yb, int xf, int yf) {
        // in same x or y and f in between
        // in same x or y and f not in between
        int ans = 0;
        if (xa == xb && xb == xf) {
            int check = (yf - yb) * (yf - ya);
            ans = (yb - ya) > 0 ? (yb - ya) : (ya - yb);
            if (check < 0) {
                ans = ans + 2;
            }
            System.out.println(ans);
            return;
        } else if (ya == yb && yb == yf) {
            int check = (xf - xb) * (xf - xa);
            ans = (xb - xa) > 0 ? (xb - xa) : (xa - xb);
            if (check < 0) {
                ans = ans + 2;
            }
            System.out.println(ans);
            return;
        }
        // not in same x or y
        int ansY = (yb - ya) > 0 ? (yb - ya) : (ya - yb);
        int ansX = (xb - xa) > 0 ? (xb - xa) : (xa - xb);
        ans = ansY + ansX;
        System.out.println(ans);
    }


}


