package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Round731B {

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
            solve(s);
            t--;
        }
    }

    private static void solve(String s) {
        char[] carr = s.toCharArray();
        int start = 0;
        int end = carr.length - 1;
        char max = 'a';
        for (char c : carr) {
            if (c > max) max = c;
        }
        if (max != carr.length + 96) {
            System.out.println("NO");
            return;
        }
        for (int i = max; i >= 'a'; i--) {
            if (carr[start] == (char) i) {
                start++;
            } else if (carr[end] == (char) i) {
                end--;
            } else {
                System.out.println("NO");
                return;
            }

            if (start > end) {
                System.out.println("YES");
                return;
            }
        }
    }


}


