package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Round723BSOL {


    public static void getANS(BigInteger num) {
         int n = num.intValue();
        for (int i = 0; i < 20; i++) {
            int z = 111*i;
            if (z > n) break;
            int rem = n - z;
            if (rem % 11 == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
//        FastReader scanner = new FastReader();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            BigInteger n = scanner.nextBigInteger();
            getANS(n);
            t--;
        }
    }
}
