/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

//import for Scanner and other utility classes


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class TestClass1 {
    public static void main(String args[] ) throws Exception {
        // Sample code to perform I/O:
         //* Use either of these methods for input

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
                FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        //Scanner
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t >  0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            k = k%n;
            for(int l = 0; l < n ; l++) {
                int p = arr[(l+n-k)%n];
                out.write(p + " ");
            }
            out.write("\n");
            t--;
        }
        s.close();
        out.flush();

    }
}
