package gfg.arrays;

public class KthSmallerElem {

    // if elem < pivot { i++ and swap(i,j) } else nothing
    private int getPartitionPos(int[] arr, int  l, int r) {
        int i = l;
        for (int j = l; j < r-l+1; j++) {
            if (arr[r] > arr[j]) {
             i++;
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
            }
        }
        return i;
    }

    // use partitioning in quick sort to get the position of pivot
    // then decide of pos > k then get pos for left slice else right slice of arr
    private int getKthSmallerstElem(int[] arr, int start, int end,  int k) {
        int pos = getPartitionPos(arr, start, end-1);
        if (pos ==  k) return arr[pos];
        if (pos > k) return getKthSmallerstElem(arr, start, pos, k);
        else return getKthSmallerstElem(arr, pos+1, end, k);
    }
}
