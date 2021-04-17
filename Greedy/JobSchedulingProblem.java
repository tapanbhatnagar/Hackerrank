package Greedy;

import java.util.*;

public class JobSchedulingProblem {

    class Job {
        int id, profit, deadline;

        Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }

    int[] JobScheduling(Job[] arr, int n) {
        List<Job> arrlist = Arrays.asList(arr.clone());
        arrlist.sort((o1, o2) -> o2.profit - o1.profit);
        int maxProfit = arrlist.get(0).profit;
        int timeElapsed = 1;
        for (int i = 1; i < arrlist.size(); i++) {
            if (arrlist.get(i).deadline > timeElapsed) {
                maxProfit += arrlist.get(i).profit;
                timeElapsed++;
            }
        }
        return new int[]{timeElapsed, maxProfit};
    }
}
