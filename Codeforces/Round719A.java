package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Round719A {

    public static String getOutput(String s, int len) {
        if (len == 1) {
            return "YES";
        }
        Set<Character> set = new HashSet<>();
        char[] charArr = s.toCharArray();
        set.add(charArr[0]);
        for (int i = 1; i < len; i++) {
            if (charArr[i] != charArr[i-1]) {
                if (set.contains(charArr[i])){
                    return "NO";
                }
                set.add(charArr[i]);
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            System.out.println(getOutput(s, n));
        }
    }
}
