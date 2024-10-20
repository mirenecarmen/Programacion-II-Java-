package clase3;


import javax.swing.JOptionPane;

public class Ejercicio3ConClaseJoptionPane {
    public static void main(String[] args) {
        int numero;
        System.out.println("digite un numero:");
        numero = Integer.parseInt(JOptionPane.showInputDialog("digute un numero:"));
        while (numero != 0){
            if (numero %2 == 0){
                JOptionPane.showMessageDialog(null,"el numero ingresado"+numero+"es par");
            }
            else {
                JOptionPane.showMessageDialog(null,"el numero ingresado"+numero+"es Impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero:"));
        }
        JOptionPane.showMessageDialog(null,"el numero ingresado es: " + numero + "finaliza el programa");
    }
}
