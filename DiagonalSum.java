public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];          // primary diagonal
            sum += matrix[i][n - 1 - i];  // secondary diagonal
        }

        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];  // avoid double-counting center
        }

        System.out.println("Sum of diagonal elements: " + sum);
    }
}

//Matrix:
/*1 2 3
4 5 6
7 8 9*/

//Sum of diagonal elements: 25

