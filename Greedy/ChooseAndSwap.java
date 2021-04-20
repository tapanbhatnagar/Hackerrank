package Greedy;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class ChooseAndSwap {

    static Integer getFrequency(char[] arr, char c) {
        Integer freq = 0;
        for(char elem: arr) {
            if (elem == c) freq++;
        }
        return freq;
    }

    //Function to get the maximum total value in the knapsack.
    static String chooseandswap(String A){
        // Code Here
        char[] arr = A.toCharArray();
        char minChar = 'z';

        Map<String, Integer> counterMap= new HashMap();
        for(char c : arr){
            if (minChar > c) minChar = c;
            if (counterMap.containsKey(c)) {
                int freq = counterMap.get(c);
                counterMap.replace(String.valueOf(c), freq);
            } else {
                counterMap.put(String.valueOf(c),getFrequency(arr, c));
            }
        }

        Map.Entry<String,Integer> entry = Collections.max(counterMap.entrySet(),Comparator.comparingInt(Map.Entry::getValue));
        char maxChar = entry.getKey().toCharArray()[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minChar) {
                arr[i] = maxChar;
            }else if (arr[i] == maxChar) {
                arr[i] = minChar;
            }
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {

        System.out.println(chooseandswap("ccad"));
    }
}
