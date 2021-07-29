package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Round726E1 {

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
        int k = scanner.nextInt();
        String s = scanner.next();
        String res = solve(s, n, k);
        System.out.println(res);
    }

    private static String solve(String s, int n, int k) {
        if (n >= k) {
            n = k;
        }
        char[] carr = s.toCharArray();
        int limit = carr.length - 1;
        for (int i = 1; i < carr.length; i++) {
            if(carr[i] >= carr[0]) {
                limit = i-1;
                break;
            }
        }
        String[] arr = new String[n - limit];
        for (int i = 0; i < n - limit; i++) {
            String iterString = s.substring(0, n - i);
            StringBuilder elem = new StringBuilder(iterString);
            while (elem.length() < k) {
                elem.append(iterString);
            }
            arr[i] = elem.substring(0, k);
        }
        Arrays.sort(arr);
        return arr[0];
    }
}


