package gfg.string;

public class palidrome {

    public static boolean isPalindrome(char[] s) {
        if (s == null || s.length == 0) return false;
        int i = 0;
        int j = s.length-1;
        while(i < j) {
            if (s[i] != s[j]) return false;
            i++;j--;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
