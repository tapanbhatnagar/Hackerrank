package codechef.juneChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHFHEIST {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        try {
            FastReader scanner = new FastReader();
            int t = scanner.nextInt();
            while (t > 0) {
                int D = scanner.nextInt();
                int d = scanner.nextInt();
                int P = scanner.nextInt();
                int Q = scanner.nextInt();
                getRes(D, d, P, Q);
                t--;
            }
        } catch (Exception e) {
            return;
        }


    }

    private static void getRes(int days, int interval, int p, int q) {
        if (days == 0 || interval == 0 || days == interval) {
            System.out.println(interval * p);
            return;
        }

        double res = days * p;
        if (q > 0) {
            int n = days / interval;
            int fact = (n - 1) * n / 2;
            res += fact * interval * q;
            int r = days % interval;
            if (r > 0) {
                res += r * n * q;
            }
        }
        System.out.println((int)res);
    }
}
