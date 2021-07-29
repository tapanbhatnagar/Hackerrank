package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

public class Round725C {

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
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            solve(arr, n, l, r);
            t--;
        }
    }

    private static void solve(int[] arr, int n, int l, int r) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        AtomicInteger twice_count = new AtomicInteger();

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)

        for (int i = 0; i < n; i++) {
            int maxSum = r - arr[i];
            int minSum = l - arr[i] ;
            int finalI = i;
            hm.forEach((a, count) -> {
                if (a >= minSum && a <= maxSum) {
                    if (a == arr[finalI]) count--;
                    twice_count.addAndGet(count);
                }
            });
            if (2*arr[i] >= minSum && 2*arr[i] <= maxSum) {
                twice_count.decrementAndGet();
            }
        }

        // return the half of twice_count
        System.out.println(twice_count.get()/2);
    }

}
