package Codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Round729CExt {

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
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            solve(n1, n2);
            t--;
        }
    }

    private static void solve(int n1, int n2) {
        int ans = 0;
        for (int i = n1; i < n2+1; i++) {
            if (i%2 != 0) {
                System.out.println(2+", ");
            ans += 2;}
            else if(i%3 == 0){
                int j = 4;
                while (true) {
                    if (i%j != 0) {
                        System.out.println(j+", ");
                        ans += j;
                        break;
                    }
                    j++;
                }
            } else{
                System.out.println(3+", ");
                ans += 3;
            }
        }
        System.out.println(ans);
    }


}


