package gfg.arrays;

public class ReverseArray {

    private int[] arr = null;

    private int[] reverse() {
        if (this.arr == null || this.arr.length == 0) return null;

        int length =  this.arr.length;
        int start = 0, end = length -1;
        while (start<=end) {
            int temp = this.arr[start];
            this.arr[start] = this.arr[end];
            this.arr[end] = temp;
            start++;
            end--;
        }
        return this.arr;
    }
}
