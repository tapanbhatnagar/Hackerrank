import java.math.BigInteger;
import java.util.Scanner;

public class Round723B {


    public static void getANS(BigInteger num) {
        if (num.equals(BigInteger.valueOf(1000000000))) {
            System.out.println("NO");
            return;
        }
        int n = num.intValue();
        if (n < 111) {
            if (n % 11 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }
        int[] arr = new int[]{11,
                111,
                1111,
                11111,
                111111,
                1111111,
                11111111,
                111111111
        };
        int len = getDivi(n);
        while (n >= 11) {
            for (int i = 0; i < len + 1; i++) {
                if (n % arr[i] == 0) {
                    System.out.println("YES");
                    return;
                }
            }
            if (n >= arr[len]) {
                n = n - arr[len];
            } else {
                n = n - arr[len - 1];
                len--;
            }
        }

        System.out.println("NO");
    }

    private static int getDivi(int n) {
        if (n < 100000) {
            // 5 or less
            // 3 or 4 or 5
            if (n < 100) {
                return 0;
            }
            if (n < 1000)
                return 1;
            else {
                // 4 or 5
                if (n < 10000)
                    return 2;
                else
                    return 3;
            }
        } else {
            // 6 or more
            if (n < 10000000) {
                // 6 or 7
                if (n < 1000000)
                    return 4;
                else
                    return 5;
            } else {
                // 8 to 10
                if (n < 100000000)
                    return 6;
                else {
                    // 9 or 10
                    if (n < 1000000000)
                        return 7;
                    else
                        return 8;
                }
            }
        }
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
