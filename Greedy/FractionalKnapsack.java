package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {
    static class Item {
        int value, weight;
        Item(int x, int y) {
            this.value = x;
            this.weight = y;
        }
    }

    //Function to get the maximum total value in the knapsack.
    static double fractionalKnapsack(int W, Item[] arr, int n)
    {
        // Your code here
        List<Item> arrSortedItems = Arrays.asList(arr);
        arrSortedItems.sort((o1, o2) -> o2.value/o2.weight - o1.value/o1.weight);
        int totalWeight = arrSortedItems.get(0).weight;
        double totalValue = arrSortedItems.get(0).value;
        for (int i = 1; i < arr.length; i++) {
            if (W >= totalWeight + arrSortedItems.get(i).weight) {
                totalWeight +=  arrSortedItems.get(i).weight;
                totalValue += arrSortedItems.get(i).value;
            } else {
                totalValue += ((double)(W - totalWeight)/arrSortedItems.get(i).weight)*arrSortedItems.get(i).value;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Item[] arr = new Item[] {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30),
        };
        System.out.println(fractionalKnapsack(50, arr, 3));
    }
}
