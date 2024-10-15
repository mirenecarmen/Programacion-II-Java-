package Clase5;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio8ConClaseJoptionpane {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));
        int i = 1;
        while (i <= numero) {
            JOptionPane.showMessageDialog(null,i);
            i++;
        }
    }
}
