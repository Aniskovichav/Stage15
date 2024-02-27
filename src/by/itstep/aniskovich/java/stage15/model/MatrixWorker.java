package by.itstep.aniskovich.java.stage15.model;

public class MatrixWorker {


    private static int sumDiagonalMatrix(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix[i].length; i++) {
            sum += matrix[i][i];
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
}
