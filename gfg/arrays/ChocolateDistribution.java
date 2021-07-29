package gfg.arrays;

import java.util.ArrayList;

public class ChocolateDistribution {

    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        a.sort((o1, o2) -> (int) (o1 - o2));
        Long min = Long.MAX_VALUE;
        for (int i = 0; i + 5 < n; i++) {
            long diff = a.get((int) (i+m-1)) - a.get(i);
            if (min > diff) {
                min = diff;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
       ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add((long) arr[i]);
        }
        System.out.println(findMinDiff(arrayList, arrayList.size(), 5));
    }
}
