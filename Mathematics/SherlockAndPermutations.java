package Mathematics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class SherlockAndPermutations {

    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
          return b;
        if (b == 0)
          return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }

    static BigInteger factorial(int a) {
        if (a == 1 || a == 0) return BigInteger.valueOf(1);
        return BigInteger.valueOf(a).multiply(factorial(a-1));
    }
    // Complete the solve function below.
    static int solve(int n, int m) {
        BigInteger mnfact =factorial(m + n -1);
        BigInteger mFact = factorial(m-1);
        BigInteger nFact = factorial(n);

        return mnfact.divide(mFact.multiply(nFact)).mod(BigInteger.valueOf(1000000007)).intValue();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(solve(2,4));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = solve(n,n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
