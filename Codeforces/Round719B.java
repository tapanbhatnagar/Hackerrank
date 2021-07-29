package Codeforces;

import java.util.Scanner;

public class Round719B {

    public static int getOrdiaryNumber(int n) {

        if (n < 10) {return n;}
        if (n == 1000000000) return 81;

        int len = String.valueOf(n).length();
        int ans = (len -1)*9;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            stringBuilder.append("1");
        }
        int start = Integer.parseInt(stringBuilder.toString());
        for (int i = 1; i < 10; i++) {
            if ((start*i) <= n) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(getOrdiaryNumber(n));
        }
    }
}
