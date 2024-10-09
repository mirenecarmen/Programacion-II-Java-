package Clase2CiclosconClases;

/* EJERCICIO 2:  leer un numero e indicar si es positivo o negativo.El proceso se repetira
hasta que se introduzca un 0
 */

import javax.swing.JOptionPane;

public class Ejercicio2conClaseJOptionPane {
    public static void main(String[] args) {

   // JOptionPane entrada = new Scanner(System.in);
        //System.out.println("digite un numero: ");
        var numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        while (numero != 0 ) {
            if (numero > 0) {
            JOptionPane.showMessageDialog(null,"el numero" + numero + "es positivo");
        }
        else{
            JOptionPane.showMessageDialog(null,"el numero" + numero + "es negativo");
        }
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));

    }
        JOptionPane.showMessageDialog(null,"el numero " + numero + "finaliza el programa");
}
}
