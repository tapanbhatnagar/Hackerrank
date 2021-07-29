package Codeforces;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Round719D {

    public static BigInteger getDiffCount(int[] arr, int n) {
        BigInteger ans = BigInteger.ZERO;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = arr[i] - i;
            int count = map.getOrDefault(diff, 0);
            map.put(diff, count+1);
        }
        for (Integer value : map.values()) {
            if (value > 1) {
                BigInteger mul = BigInteger.valueOf((long) value *(value-1)/2);
                ans = ans.add(mul);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(getDiffCount(arr, n).toString());
        }
    }
}
