package Clase4CiclosEjercicio7;


import javax.swing.JOptionPane;

public class Ejercicio7ConJoptionpane {
    public static void main(String[] args) {
        int numero,conteo = 0 ,suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        while (numero >= 0) {
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero :"));
        }
        if (conteo==0){
            JOptionPane.showMessageDialog(null,"error,la division entre 0 no existe.");
        }
        else {
            promedio =(float) suma /conteo;
            JOptionPane.showMessageDialog(null,"el promero es :" +promedio);
        }
    }
}
