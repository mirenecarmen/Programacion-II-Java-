package clase2;


import javax.swing.JOptionPane;

public class CicloConClaseJOptionPane {
    public static void main(String[] args) {

            int numero, cuadrado;
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));
            while (numero >= 0) {
                cuadrado = (int) Math.pow(numero, 2);
                System.out.println("el numero " + numero + "elevado al cuadrado es:" + cuadrado);
                System.out.println("digite otro numero:");
                Integer.parseInt(JOptionPane.showInputDialog("digite otro numero :"));
            }
            System.out.println("el programa ha finalizado por numero negativo");
        }

    }
