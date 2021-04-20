package Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen
public class StringTokens {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       s = s.trim();
        if (s.length() > 400000) return;
        if (s.length() == 0) {
            System.out.println("0");
        }

        String[] arr  = s.split("[!,?._'@|\\s]+");
       System.out.println(arr.length);
       for (String a : arr) {
           System.out.println(a);
       }
       scanner.close();
    }
}
