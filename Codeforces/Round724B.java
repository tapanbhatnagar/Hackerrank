package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Round724B {
    static PrintWriter out = new PrintWriter(System.out);

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
            String s = scanner.next();
            solve(s, n);
            t--;
        }
        out.close();
    }

    private static void solve(String s, int n) {
        int compareLen = 1;
        while (compareLen <= n) {
            getArr(compareLen);
            for (String s1 : arr) {
                if (!s.contains(s1)) {
                    System.out.println(s1);
                    return;
                }
            }
            compareLen++;
        }
    }

    private static void getArr(int compareLen) {
        arr = new ArrayList<>();
        char[] chars = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        printAllKLengthRec(chars, "", chars.length, compareLen);
    }

    static List<String> arr = new ArrayList<>();

    static void printAllKLengthRec(char[] set,
                                   String prefix,
                                   int n, int k) {
        if (k == 0) {
            arr.add(prefix);
            return;
        }
        for (int i = 0; i < n; ++i) {
            String newPrefix = prefix + set[i];
            printAllKLengthRec(set, newPrefix,
                    n, k - 1);
        }
    }

}
