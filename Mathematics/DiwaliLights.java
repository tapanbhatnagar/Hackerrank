package Mathematics;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiwaliLights {

    /*
     * Complete the lights function below.
     */
    static long lights(int n) {
        /*
         * Write your code here.
         */
        BigInteger bz = BigInteger.valueOf(2);
        return (bz.pow(n).subtract(BigInteger.valueOf(1))).mod(BigInteger.valueOf(100000)).longValue();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
          System.out.println(lights(8291));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//            long result = lights(n);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
