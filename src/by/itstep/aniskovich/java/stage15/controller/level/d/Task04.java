package by.itstep.aniskovich.java.stage15.controller.level.d;

import by.itstep.aniskovich.java.stage15.util.MatrixInit;
import by.itstep.aniskovich.java.stage15.view.ConsolePrinter;

import static by.itstep.aniskovich.java.stage15.model.MatrixWorker.existsValueBelowSecondaryDiagonal;
import static by.itstep.aniskovich.java.stage15.util.MatrixInit.initializeMatrix;
import static by.itstep.aniskovich.java.stage15.util.MatrixInit.randomSize;
import static by.itstep.aniskovich.java.stage15.util.MatrixUI.existsValueBelowSecondaryDiagonalUI;
import static by.itstep.aniskovich.java.stage15.view.ConsolePrinter.printMatrix;

public class Task04 {
    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(randomSize());

        MatrixInit.randomInitElement(matrix);

        ConsolePrinter.print(printMatrix(matrix));

        int valueToCheck = 0; //any value

        ConsolePrinter.print(existsValueBelowSecondaryDiagonalUI
                (existsValueBelowSecondaryDiagonal(matrix, valueToCheck),
                        valueToCheck));

    }
}
