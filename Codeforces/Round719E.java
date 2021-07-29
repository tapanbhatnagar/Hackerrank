package Codeforces;

import java.util.Scanner;

public class Round719E {

    public static int getSheepSteps(String[] arr, int n) {
        int firsthalf = 0;
        int sechalf = 0;
        for (int i = 0; i < n/2; i++) {
                if (arr[i] == "*")
                    firsthalf++;
        }
        for (int i = n/2 + 1; i < n; i++) {
                if (arr[i] == "*")
                    sechalf++;
        }
        int start = 0;
        int end = n;
        if (firsthalf > sechalf) {
            start = n;
            end = 0;
        }
        int sheep = start;
        int notSheep = end;
        for (int i = start; i < end; i++) {
            if (arr[i].equals("*")){
                sheep = i;
            } else notSheep = i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String[] arr = new String[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.next();
            }
            System.out.println(getSheepSteps(arr, n));
        }
    }
}
