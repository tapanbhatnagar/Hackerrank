package gfg.matrix;

public class SpiralTraversal {

    public static void trav(int[][] arr, int minr, int minc,int maxr, int maxc) {
        if (maxr < minr || maxc < minc) return;

        for (int i = minc; i <= maxc; i++) {
            System.out.print(arr[minr][i] + " ");
        }
        for (int i = minr+1; i <= maxr; i++) {
            System.out.print(arr[i][maxc] + " ");
        }
        if (maxr != minr) {
            for (int i = maxc - 1; i >= minc; i--) {
            System.out.print(arr[maxr][i] + " ");
            }
        }
        if (maxc != minc) {
            for (int i = maxr-1; i >= minr+1; i--) {
            System.out.print(arr[i][minc] + " ");
            }
        }
        trav(arr,minr+1,minc+1, maxr-1, maxc -1);
    }
    public static void main(String[] args) {
        int r = 3, c = 4;
        int[][] matrix = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}};
        trav(matrix,0,0,r-1,c-1);
    }
}
