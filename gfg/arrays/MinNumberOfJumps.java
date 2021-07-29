package gfg.arrays;

public class MinNumberOfJumps {

    static int getIndxOfMax(int[] arr, int start, int end) {
        int maxIndex = start;
        int max = arr[start];
        for (int i = start; i < end + 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int minJumps(int[] arr, int n){
        // Your code here
        int  i = 0;
        int counter = 1;

        while(i < arr.length ) {
            if (i + arr[i] >=  arr.length -1) return counter;
            i = getIndxOfMax(arr, i+1, i+arr[i]);
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[]  arr = new int[]{10, 8, 12 ,17 ,1 ,21, 5 ,17 ,20 ,11, 5 ,27 ,23 ,8, 12, 18, 16, 12, 9, 8, 17, 12, 23, 26, 0 ,5, 9, 24, 10 };
        int n = arr.length;
        System.out.println(minJumps(arr, n));
    }

}
