package Mathematics;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class SummingNSeries {

    /*
     * Complete the summingSeries function below.
     */
    static int summingSeries(long n) {
        /*
         * Write your code here.
         */

        // n^2%d = ((n%d)*(n%d))%d
        long divd = (long) (Math.pow(10,9) + 7);
        return (int) (((n%divd)*(n%divd))%divd);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(summingSeries(229137999));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(scanner.nextLine().trim());
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            long n = Long.parseLong(scanner.nextLine().trim());
//
//            int result = summingSeries(n);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
    }
}
