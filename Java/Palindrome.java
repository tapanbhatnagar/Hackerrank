package Java;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i = 0;
        int j = A.length()-1;

        char[] arr = A.toCharArray();
        while (i <= j) {
            if (arr[i] != arr[j]) {
                System.out.println("No");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Yes");
    }
}
