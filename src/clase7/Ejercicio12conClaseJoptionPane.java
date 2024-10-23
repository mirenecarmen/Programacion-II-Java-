package clase7;

import javax.swing.JOptionPane;

/* ejercicio 12: pedir un numero y calcular su factorial */
public class Ejercicio12conClaseJoptionPane {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner (System.in);
        long factorial =1;
        //System.out.println("digite un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
        for (int i = 1; i <= numero; i++){
            factorial *= i;
        }
        System.out.println("el factorial de :" +factorial);
        JOptionPane.showMessageDialog(null,"el factorial del numero ingresado es :" +factorial);
    }
}
