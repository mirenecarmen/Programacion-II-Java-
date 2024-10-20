package clase3;
/* realizar un juego para adivinar un numero.Para ello,generar un numero aleatorio entre 0 1 100 y luego
 * ir pidiendo numero indicando si "es mayor" o "es menor" segun sea mayor o menor con respecto a N.
 * El proceso termina cuanto el usuario acierta y mostramos el numero de intentos hechos */

import javax.swing.JOptionPane;


public class Ejercicio5ConClaseJoptionPane {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random()*100);//esto genera un numero aleatorio
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
            if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null,"digite un numero mayor:");
            }
            else if (numero > aleatorio){
                JOptionPane.showMessageDialog(null,"digite un numero menor:");
            }
            else {
                JOptionPane.showMessageDialog(null,"has adivinado el numero ¡!");
            }
            conteo ++;
        }while (numero != aleatorio);
        JOptionPane.showMessageDialog(null,"adivinaste el numero en :" + conteo + " intentos.");
    }
}
