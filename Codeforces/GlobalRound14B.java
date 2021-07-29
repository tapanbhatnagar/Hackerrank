package Codeforces;

import java.util.Scanner;

public class GlobalRound14B {

    public static void getGold( int n) {
        if (n%2 != 0) {System.out.println("NO"); return;}
        while(n%2 == 0) {
            n = n / 2;
        }
        double sq = Math.sqrt(n);
        if ((sq - Math.floor(sq)) == 0) {
            System.out.println("YES");
        } else System.out.println("NO");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            getGold(n);
        }
    }
}
