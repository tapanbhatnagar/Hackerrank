package Codeforces;

import java.util.Scanner;

public class Round713A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a != b) {
                int c = scanner.nextInt();
                if (b != c) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                for (int i = 1; i < n - 1; i++) {
                    int c = scanner.nextInt();
                    if(a != c) {
                        System.out.println(i+2);
                        break;
                    }
                }
            }
            scanner.nextLine();
            t--;
        }
    }
}
