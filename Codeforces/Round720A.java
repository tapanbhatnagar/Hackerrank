package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Round720A {

    public static void getGoodNumber(int a, int b) {
        if (b == 1) {
            System.out.println("NO");
            return;
        }
        if (b == 2) {
            BigInteger x = BigInteger.valueOf((long) a);
            BigInteger y = BigInteger.valueOf((long) 3 * a);
            BigInteger z = BigInteger.valueOf((long) 4 * a);
            printSucees(x, y, z);
            return;
        }

        BigInteger x = BigInteger.valueOf((long) a);
        BigInteger y = BigInteger.valueOf((long) (b - 1) * a);
        BigInteger z = BigInteger.valueOf((long) b * a);
        printSucees(x, y, z);
    }

    public static void printSucees(BigInteger x, BigInteger y, BigInteger z) {
        System.out.println("YES");
        System.out.println(x.toString() + " " + y.toString() + " " + z.toString());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            getGoodNumber(a, b);
        }
    }
}
