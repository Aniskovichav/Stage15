package by.itstep.aniskovich.java.stage15.model;

public class MatrixWorker {
    //a
    public static int findMaxAboveDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

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

    public static int findMaxBelowDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static int findMaxAboveSecondaryDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length - 1 - i; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static int findMaxBelowSecondaryDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = matrix.length - i; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    //b
    public static int countEvenAboveDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countEvenBelowDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countEvenAboveSecondaryDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int count = 0;
        int n = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countEvenBelowSecondaryDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = matrix.length - i; j < matrix.length; j++) { // O(N^2)
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    //c
    public static int countPositiveAboveDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countPositiveBelowDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countPositiveAboveSecondaryDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1 - i; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countPositiveBelowSecondaryDiagonal(int[][] matrix) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return -1;
        }

        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = matrix.length - i; j < matrix.length; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    //d
    public static boolean existsValueAboveDiagonal(int[][] matrix, int value) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean existsValueBelowDiagonal(int[][] matrix, int value) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return false;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean existsValueAboveSecondaryDiagonal(int[][] matrix,
                                                            int value) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1 - i; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean existsValueBelowSecondaryDiagonal(int[][] matrix,
                                                            int value) { // O(N^2)
        if (matrix == null || matrix.length == 0
                || matrix.length != matrix[0].length) {
            return false;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = matrix.length - i; j < matrix.length; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
}
