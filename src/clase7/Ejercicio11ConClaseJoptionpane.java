package clase7;
/* ejercicio 11: diseñar un programa que muestre el producto de los 10 primerso numeros impares */

import javax.swing.JOptionPane;

public class Ejercicio11ConClaseJoptionpane {
    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1; i <= 10; i+=2){ //el aumento apunta a solo ir por los impares
            producto *= i;
        }
        JOptionPane.showMessageDialog(null,"El producto de los numeros impares es :" +producto);
    }
}
