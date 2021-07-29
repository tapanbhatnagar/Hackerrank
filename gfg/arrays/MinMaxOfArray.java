package gfg.arrays;

import java.util.Arrays;

public class MinMaxOfArray {

    class Pair {
        int min, max;

        Pair(int m1, int m2) {
            this.min = m1;
            this.max = m2;
        }
    }

    // with usual way : traverse the arr and compare all elements - 1 + 2(n-2) comparisons
    // time complexity : O(n)
    private Pair getMinMaxLinearSearch(int[] arr) {
        // edge cases ; length == 0 or null

        int min = 0;
        int max = 0;
        if (arr[0] > arr[1]) {
            max = arr[0];
            min = arr[1];
        } else {
            max = arr[1];
            min = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new Pair(min, max);
    }

    // Tournament Method:
    private Pair getMinMaxTournamentMethod(int[] arr) {
        if (arr.length == 1) {
            return new Pair(arr[0], arr[1]);
        } else if (arr.length == 2) {
            if (arr[0] <= arr[1]) {
                return new Pair(arr[0], arr[1]);
            }
            return new Pair(arr[1], arr[0]);
        } else {
            Pair p1 = getMinMaxTournamentMethod(Arrays.copyOfRange(arr, 0, (arr.length / 2)));
            Pair p2 = getMinMaxTournamentMethod(Arrays.copyOfRange(arr, (arr.length / 2), arr.length));
            return new Pair(Math.min(p1.min, p2.min), Math.min(p1.max, p2.max));
        }
    }

    // compare inn pairs
    private Pair getMinMaxPairMethod(int[] arr) {
        int min = -1;
        int max = -1;
        int counter = 0;
        if (arr.length % 2 != 0) {
            min = arr[0];
            max = arr[0];
            counter = 1;
        } else {
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }
            counter = 2;
        }

        for (int i = counter; i < arr.length; i++) {
            int minp = 0;
            int maxp = 0;
            if (arr[i] < arr[i + 1]) {
                minp = arr[i];
                maxp = arr[i + 1];
            } else {
                minp = arr[i + 1];
                maxp = arr[i];
            }
            if (min > minp) {
                min = minp;
            }
            if (max < maxp) {
                max = maxp;
            }
            i++;
        }

        return new Pair(min, max);
    }
}
