package Clase3;
/*ejrcicio 4:pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido */


import javax.swing.*;

public class Ejercicio4ConJoptionPane {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
        while (numero>=0) {
            JOptionPane.showMessageDialog(null,"el numero " + numero + "es positivo");
            conteo ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
        }

        JOptionPane.showMessageDialog(null,"ha ingresado " + conteo + "numero que no son negativos");

        System.out.println("ha ingresado " + conteo + "numeros.");
    }
}
