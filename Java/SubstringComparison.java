package Java;

import java.util.Scanner;

class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "zzz";
        String largest = "aaa";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i+k <= s.length(); i++) {
            String sub = s.substring(i,i+k);
            if (largest.compareTo(sub) < 0){
                largest = sub;
            }
            if (smallest.compareTo(sub) > 0) {
                smallest = sub;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
