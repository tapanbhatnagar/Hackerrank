package Mathematics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EvenOddQuery {

    // Complete the solve function below.
    static String[] solve(int[] arr, int[][] queries) {
        String[] res = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int first = queries[i][0];
            int second = queries[i][1];
            if (first < arr.length && arr[first] == 0 && first != second) {
                res[i] = "Odd";
            } else {
                if (arr[first - 1] % 2 == 0) {
                    res[i] = "Even";
                } else res[i] = "Odd";
            }
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);


    // Boiler Plate issue, instead of string split in arr -> scanner.nextInt() directly in loop
    // This is causing time out
    public static void main(String[] args) throws IOException {
//        int[]  arr1 = new int[]{
//                6,5,6,9,3,7,4,5,2,5,4,7,4,4,3,0,8,8,6,8,8,4,3,1,4,9,2,0,9,8,9,2,6,6,4,9,5,0,3,8,7,1,7,2,7,2,2,6,1,0,9,1,5,9,4,9,0,7,1,7,7,1,1,5,9,7,7,6,7,3,6,5,6,3,9,4,8,1,2,9,3,9,0,1,8,5,0,4,6,3,8,5,6,1,1,5,9,8,4,8
//    };
//        int[][] queries1 = new int[][] {
//                new int[]{42, 51},new int[]{1, 94}
//        };
//        String[] strings = solve(arr1, queries1);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output/EvenOddQuery.txt"));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
//            int arrItem = Integer.parseInt(arrItems[arrItr]);
//            arr[arrItr] = arrItem;
            arr[arrItr] = scanner.nextInt();
        }

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] queries = new int[q][2];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr]);
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        String[] result = solve(arr, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(result[resultItr]);

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
