package Ejercicio4Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio6ConClaseJoptionpane {
    public static void main(String[] args) {
        int numero,suma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
            suma += numero;
        }while (numero != 0);
        JOptionPane.showMessageDialog(null,"la suma de todos los numeros ingresados es :"+suma);
    }

}
