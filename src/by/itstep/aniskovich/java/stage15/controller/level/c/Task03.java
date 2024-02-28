package by.itstep.aniskovich.java.stage15.controller.level.c;

import by.itstep.aniskovich.java.stage15.util.MatrixInit;
import by.itstep.aniskovich.java.stage15.view.ConsolePrinter;

import static by.itstep.aniskovich.java.stage15.model.MatrixWorker.countEvenBelowDiagonal;
import static by.itstep.aniskovich.java.stage15.model.MatrixWorker.countPositiveAboveSecondaryDiagonal;
import static by.itstep.aniskovich.java.stage15.util.MatrixInit.initializeMatrix;
import static by.itstep.aniskovich.java.stage15.util.MatrixInit.randomSize;
import static by.itstep.aniskovich.java.stage15.util.MatrixUI.countEvenBelowDiagonalUI;
import static by.itstep.aniskovich.java.stage15.util.MatrixUI.countPositiveAboveSecondaryDiagonalUI;
import static by.itstep.aniskovich.java.stage15.view.ConsolePrinter.printMatrix;

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(randomSize());

        MatrixInit.randomInitElement(matrix);

        ConsolePrinter.print(printMatrix(matrix));

        ConsolePrinter.print(countPositiveAboveSecondaryDiagonalUI
                (countPositiveAboveSecondaryDiagonal(matrix)));

    }
}
