package gfg.arrays;

import java.util.*;

public class MinHeights {

    static class Pair{
        int indx;
        int value;
        Pair(int a, int b){
            this.indx = a;
            this.value = b;
        }
    }

    // sort the array and keep comparing min, max of each elem with existing arr min, max
    private static int getMinDiffHeights(int[] arr,int n, int k) {
        if (n <= 1) return 0;
        Arrays.sort(arr);
        if (k > arr[n-1] - arr[0]) return arr[n-1] - arr[0];

        List<Pair> newPosArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] - k > 0) newPosArr.add(new Pair(i, arr[i] - k));
            newPosArr.add(new Pair(i,arr[i]+k));
        }
        Collections.sort(newPosArr, Comparator.comparingInt(o -> o.value));
        int i=0;
        int j=n-1;
        int minDiff = newPosArr.get(j).value - newPosArr.get(i).value;
        int size = newPosArr.size();
        while(j < size) {
           int currDiff = newPosArr.get(j).value - newPosArr.get(i).value;
           minDiff = Math.min(minDiff, currDiff);
           int currIndx = newPosArr.get(i).indx;
           i++;
           while(newPosArr.get(j).indx == currIndx) {
               j++;
           }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 5, 8, 6, 4, 10, 3, 8, 9, 10};
        int k = 5;
        int result = getMinDiffHeights(arr, 10, k);
        System.out.println(result);
    }

}
