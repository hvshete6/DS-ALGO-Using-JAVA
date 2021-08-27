import java.util.*;

class Solution {
    public static void main(String[] args) {
        int a[][] = new int[10][10];
        int m = 4, n = 4, i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Enter Number in Pocket [" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int row = 0, col = 0;
        while (row < m && col < n) {
            for (i = col; i < n; i++) {
                System.out.print(a[row][i] + " ");
            }
            row++;
            for (i = row; i < m; i++) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            if (row < m) {
                for (i = n - 1; i >= col; i--) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            if (col < n) {
                for (i = m - 1; i >= row; i--) {
                    System.out.print(a[i][col] + " ");
                }
                col++;
            }

        }

    }
}