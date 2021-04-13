import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        BigInteger minSum = BigInteger.ZERO;
        BigInteger maxSum = BigInteger.ZERO;
        for (int i = 0; i < 5; i++) {
            if (i < 4) minSum = minSum.add(BigInteger.valueOf(sortedArr[i]));
            if (i > 0) maxSum = maxSum.add(BigInteger.valueOf(sortedArr[i]));
        }
        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
