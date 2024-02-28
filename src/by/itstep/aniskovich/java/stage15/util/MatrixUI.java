package by.itstep.aniskovich.java.stage15.util;

public class MatrixUI {
    public static String findMaxAboveDiagonalUI(int max) {
        return String.format("Max element of matrix located " +
                        "above the diagonal is %d.",
                max);
    }

    public static String findMaxBelowDiagonalUI(int max) {
        return String.format("Max element of matrix located " +
                        "below the diagonal is %d.",
                max);
    }

    public static String findMaxAboveSecondaryDiagonalUI(int max) {
        return String.format("Max element of matrix located " +
                        "above the secondary diagonal is %d.",
                max);
    }

    public static String findMaxBelowSecondaryDiagonalUI(int max) {
        return String.format("Max element of matrix located " +
                        "below the secondary diagonal is %d.",
                max);
    }

    public static String countEvenAboveDiagonalUI(int count) {
        return String.format("The number of even numbers of the matrix" +
                        " above the diagonal is equal to %d.",
                count);
    }

    public static String countEvenBelowDiagonalUI(int count) {
        return String.format("The number of even numbers of the matrix" +
                        " below the diagonal is equal to %d.",
                count);
    }
    public static String countEvenAboveSecondaryDiagonalUI(int count) {
        return String.format("The number of even numbers of the matrix" +
                        " above the secondary diagonal is equal to %d.",
                count);
    }

    public static String countEvenBelowSecondaryDiagonalUI(int count) {
        return String.format("The number of even numbers of the matrix" +
                        " below the secondary diagonal is equal to %d.",
                count);
    }

    public static String countPositiveAboveDiagonalUI(int count) {
        return String.format("The number of positive numbers of the matrix" +
                        " above the diagonal is equal to %d.",
                count);
    }

    public static String countPositiveBelowDiagonalUI(int count) {
        return String.format("The number of positive numbers of the matrix" +
                        " below the diagonal is equal to %d.",
                count);
    }

    public static String countPositiveAboveSecondaryDiagonalUI(int count) {
        return String.format("The number of positive numbers of the matrix" +
                        " above the secondary diagonal is equal to %d.",
                count);
    }

    public static String countPositiveBelowSecondaryDiagonalUI(int count) {
        return String.format("The number of positive numbers of the matrix" +
                        " below the secondary diagonal is equal to %d.",
                count);
    }

    public static String existsValueAboveDiagonalUI(boolean flag, int value) {
        return String.format("The value of %d is%b found above the diagonal",
                value, flag ? "" : " not");
    }

    public static String existsValueBelowDiagonalUI(boolean flag, int value) {
        return String.format("The value of %d is%b found below the diagonal",
                value, flag ? "" : " not");
    }

    public static String existsValueAboveSecondaryDiagonalUI(boolean flag,
                                                             int value) {
        return String.format("The value of %d is%b found above the " +
                        "secondary diagonal", value, flag ? "" : " not");
    }

    public static String existsValueBelowSecondaryDiagonalUI(boolean flag, int value) {
        return String.format("The value of %d is%b found below the " +
                        "secondary diagonal", value, flag ? "" : " not");
    }
}
