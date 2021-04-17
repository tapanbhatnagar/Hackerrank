package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.ToIntFunction;

public class Nmeetingsinaroom {
    // Pair class
    static class Pair {

        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.

    // solution : https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
    public static int maxMeetings(int start[], int end[], int n) {
        // add your code here
        Comparator.comparingInt((Pair o1) -> o1.first);
        PriorityQueue<Pair> p = new PriorityQueue((Comparator<Pair>) (o1, o2) -> o1.first - o2.first);
        int[] sortedEnd = Arrays.stream(end).sorted().toArray();
        int counter = 1;
        int prevEnd = sortedEnd[0];
        for (int i = 1; i < n; i++) {
            int indx = Arrays.binarySearch(end, sortedEnd[i]);
            if (prevEnd < start[indx]) {
                prevEnd = sortedEnd[i];
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] start = new int[]{75250, 50074, 43659, 8931, 11273,
                27545, 50879, 77924};
        int[] end = new int[]{112960, 114515, 81825, 93424, 54316,
                35533, 73383, 160252};

        int a = maxMeetings(start, end, 8);
        System.out.println(a);
    }
}
