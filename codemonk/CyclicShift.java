/* IMPORTANT: Multiple classes and nested static classes are supported */

//import for Scanner and other utility classes


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[]) throws Exception {
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
                    FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
            //Scanner
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int k = s.nextInt();
                String numString = s.next();
                int num = Integer.parseInt(numString, 2);

                int[] valueArr = new int[n];
                valueArr[0] = num;
                for (int i = 1; i < n; i++) {
                    String rotatedString = numString.substring(i, n) + numString.substring(0, i);
                    int rotatedNum = Integer.parseInt(rotatedString, 2);
                    valueArr[i] = rotatedNum;
                }
                int max = 0, maxIndex = 0, occurance = 0, result = 0;
                for (int i = 0; i < n; i++) {
                    if (max == valueArr[i]) {
                        maxIndex = i;
                        occurance++;
                    }
                    if (max < valueArr[i]) {
                        max = valueArr[i];
                        maxIndex = i;
                        occurance = 1;
                    }
                }

                if (occurance == k)
                    out.write(maxIndex + "\n");

                if (occurance > k) {
                    out.write(getIndex(valueArr, k, max) + "\n");
                }

                if (occurance < k) {
                    int recursions = k / occurance;
                    int a = k % occurance;
                    if (occurance == 1) {
                        a = 1;
                        recursions = k / occurance - 1;
                    }
                    maxIndex = getIndex(valueArr, a, max);
                    result = maxIndex + n * (recursions);
                    out.write(result + "\n");
                }
                t--;
            }
            s.close();
            out.flush();
        } catch (Exception exception) {
            return;
        }


    }

    private static int getIndex(int[] valueArr, int a, int max) {
        int maxIndex = 0;
        for (int i = 0; i < valueArr.length; i++) {
            if (valueArr[i] == max) a--;
            if (a == 0) {
                maxIndex = i;
                break;
            }
        }

        return maxIndex;
    }


}
