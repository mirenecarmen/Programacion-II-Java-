package Ejercicio4Ciclos;
/*ejercicio 6:pedir numeros hasta que se teclee un 0,mostrar la suma de todos los numeros introducidos. */
import java.util.Scanner;

public class Ejercicio6ConClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.println("digite un numero:");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }while (numero != 0);
        System.out.println("la suma de todos los numeros guardados es : " + suma);
    }
}
