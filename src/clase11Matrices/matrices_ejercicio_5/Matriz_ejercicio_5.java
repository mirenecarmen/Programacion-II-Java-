package clase11Matrices.matrices_ejercicio_5;
/*
Ejercicio 5: crear y cargar una matriz de tamaño n X m, mostrar la suma de cada
fila y de cada columna
*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Matriz_ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:"));

        matriz = new int[nFilas][nCol];

        System.out.println("Rellenando la matriz:");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular y mostrar la suma de cada fila
        System.out.println("Suma de cada fila:");
        for (int i = 0; i < nFilas; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + sumaFilas);
        }

        // Calcular y mostrar la suma de cada columna
        System.out.println("Suma de cada columna:");
        for (int j = 0; j < nCol; j++) {
            int sumaCol = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.println("Suma de la columna " + j + ": " + sumaCol);
        }
    }
}
