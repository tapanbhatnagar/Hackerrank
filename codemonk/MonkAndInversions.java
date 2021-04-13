/* IMPORTANT: Multiple classes and nested static classes are supported */

//import for Scanner and other utility classes

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass2 {
    public static void main(String args[]) throws Exception {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
                FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        //Scanner
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int[][] M = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    M[i][j] = s.nextInt();
                }
            }

            int inversions = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            if (k >= i && l >= j) {
                                if (M[i][j] > M[k][l]) {
                                    inversions++;
                                }
                            }
                        }
                    }
                }
            }
            out.write(inversions+"\n");
            t--;
        }
        s.close();
        out.flush();

    }
}
