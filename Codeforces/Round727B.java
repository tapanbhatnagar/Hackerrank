package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Round727B {

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
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        char[] substring = s.toCharArray();
        int[] arr = new int[26];
        while (q > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            for (int i = l - 1; i < r; i++) {
                arr[substring[i] - 97]++;
            }

            int ans = 0;
            for (int i = 0; i < 26; i++) {
                ans += arr[i] * (i + 1);
                arr[i] = 0;
            }
            System.out.println(ans);
            q--;
        }
    }

}


