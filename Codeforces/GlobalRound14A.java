package Codeforces;

import java.util.Scanner;

public class GlobalRound14A {

    public static void getGold(int[] arr, int n, int x) {

        if (n == 1) {
            if (arr[0] == x) System.out.println("NO");
            else printSuccess(arr);
            return;
        }

//        if (n == 2) {
//            if (arr[0] == x) {
//                int temp = arr[0];
//                arr[0] = arr[1];
//                arr[1] = temp;
//                printSuccess(arr);
//            }else if (arr[0] + arr[1] == x) {
//                System.out.println("NO");
//            } else printSuccess(arr);
//            return;
//        }

        int sum = 0;
        int limit = 0;
        for (int i = 0; i < n; i++) {
           if (sum < x) {
               sum+= arr[i];
           } else if (sum == x) {
               limit = i;
           }
        }

        if (limit == 0) {
            printSuccess(arr);
            return;
        }

        int sum2 = 0;
        int indx = 0;
        for (int i = limit+1; i < n; i++) {
            sum2 += arr[i];
//            if (sum2 > arr[limit]) {
//              indx =
//            }
        }
    }

    static String printArr(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i] + " ");
        }
        int size = stringBuilder.length();
        return stringBuilder.substring(0, size - 1);
    }

    static void printSuccess(int[] arr) {
        System.out.println("YES");
        System.out.println(printArr(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            getGold(arr, n, x);
        }
    }
}
