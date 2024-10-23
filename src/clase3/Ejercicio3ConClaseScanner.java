package clase3;

import java.util.Scanner;

public class Ejercicio3ConClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("digite un numero:");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            if (numero %2 == 0){
                System.out.println("el numero ingresaso: " + numero + "es par");
            }
            else {
                System.out.println("el numero ingresado :" + numero + "es impar");
            }
            System.out.println("digite otro numero:" );
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("el numero ingresado es " + numero + " finaliza el programa");
    }
}
