package gfg.matrix;

public class searchElem {

    public static void search(int[][] arr, int key) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            if (key <= arr[i][n-1]) {
                for (int j = 0; j < n; j++) {
                    if (key == arr[i][j]) {System.out.println("YES");
                    return;}
                }
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        search(matrix, 1);
    }
}
