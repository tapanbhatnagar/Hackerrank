package Java;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a == null  || b == null) {
            throw new IllegalArgumentException();
        }

        if (a.length() != b.length()) {
            return false;
        }

        if (a.equalsIgnoreCase(b)) {
            return true;
        }
        // Complete the function
        char[] arr = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();

        int[] frequency = new int[26];

        for(char c : arr) {
            frequency[(int) c - 97]++;
        }

        for (char c : arr2) {
            frequency[(int) c - 97]--;
        }

        for (int elem : frequency) {
            if (elem != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
