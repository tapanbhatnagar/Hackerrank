package codechef.juneChallenge;

import java.util.Scanner;

public class COCONUT {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int d = scanner.nextInt();
                int res = c / a + d / b;
                System.out.println(res);
                t--;
            }
        } catch (Exception e) {
            return;
        }


    }
}
