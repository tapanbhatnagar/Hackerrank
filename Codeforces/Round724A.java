package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Round724A {
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
        while(t > 0) {
            int  n = scanner.nextInt();

            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            solve(arr, n);
            t--;
        }
        out.close();
    }

    private static void solve(Integer[] arr, int n) {
        if (arr.length > 300)  {
            System.out.println("NO");
            return;
        }
        Set<Integer> ans = new HashSet(Arrays.asList(arr));
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                Integer diff = arr[i] - arr[j];
                Integer absDiff = (diff < 0) ? -diff : diff;
                ans.add(absDiff);
            }
        }
        if (ans.size() == n) {
            System.out.println("YES");
            System.out.println(n);
            for(Integer integer: arr) {
                System.out.print(integer + " ");
            }
            System.out.print("\n");
            return;
        }
        Integer[] newArr = new Integer[ans.size()];
        solve(ans.toArray(newArr), ans.size());
    }

}
