package Clase6.ejercicio10ConScanner;

import java.util.Scanner;

/*ejercicio 10:pedir 10 numeros y escribir la suma total */
public class Ejercicio10ClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero ,suma = 0;
        for (int i = 1; i <= 10 ; i++){
            System.out.println("digite un numero:");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
        System.out.println("la suma de todos los numeros es : " +suma);
    }
}
