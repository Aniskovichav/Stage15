package by.itstep.aniskovich.java.stage15.model;

public class MatrixWorker {
    public static int findMaxAboveDiagonal(int[][] matrix) {
        // check proof matrix

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }


    private static int sumIndexOverDiagonalMatrix(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix[i].length; i++) {
            for (int j = i - 1; j < matrix[i].length ; j++) {
                sum += matrix[i][i];
            }

        }
        return sum;
    }

    private static int sumSideDiagonalMatrix(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix[i].length - 1; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    private static int sumRowMatrix(int[][] matrix, int i) {
        int sum = 0;
        for (int j = 0; j < matrix[i].length - 1; j++) {
            sum += matrix[i][j];
        }
        return sum;
    }

    private static int sumColumnMatrix(int[][] matrix, int j) {
        int sum = 0;
        for (int i = 0; i < matrix[i].length - 1; i++) {
            sum += matrix[i][j];
        }
        return sum;
    }
}
