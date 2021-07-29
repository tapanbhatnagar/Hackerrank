package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Round731C {

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
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] narr = new int[n];
            for (int i = 0; i < n; i++) {
                narr[i] = scanner.nextInt();
            }
            int[] marr = new int[m];
            for (int i = 0; i < m; i++) {
                marr[i] = scanner.nextInt();
            }
            solve(k, n, m, narr, marr);
            t--;
        }
    }

    private static void solve(int k, int n, int m, int[] narr, int[] marr) {
        int s1 = 0;
        int s2 = 0;
        List<Integer> ans = new ArrayList<>();
        while (s1 < n && s2 < m) {
            int a = narr[s1];
            int b = marr[s2];

            if (a == 0) {
                if (a <= k) {
                    s1++;
                    k++;
                    ans.add(a);
                } else {
                    System.out.println(-1);
                    return;
                }

                if (b <= k) {
                    s2++;
                    if (b == 0) k++;
                    ans.add(b);
                } else {
                    System.out.println(-1);
                    return;
                }
            } else if (b == 0) {
                if (b <= k) {
                    s2++;
                    k++;
                    ans.add(b);
                } else {
                    System.out.println(-1);
                    return;
                }

                if (a <= k) {
                    s1++;
                    if (a == 0) k++;
                    ans.add(a);
                } else {
                    System.out.println(-1);
                    return;
                }
            } else {
                if (a <= k) {
                    s1++;
                    if (a == 0) k++;
                    ans.add(a);
                } else {
                    System.out.println(-1);
                    return;
                }

                if (b <= k) {
                    s2++;
                    if (b == 0) k++;
                    ans.add(b);
                } else {
                    System.out.println(-1);
                    return;
                }
            }

        }

        while (s1 < n) {
            ans.add(narr[s1]);
            s1++;
        }
        while (s2 < m) {
            ans.add(marr[s2]);
            s2++;
        }

        ans.forEach(it -> System.out.print(it + " "));
        System.out.println();
    }

}


