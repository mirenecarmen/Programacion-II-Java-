package Clase3;
/*ejrcicio 4:pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido */

import java.util.Scanner;

public class Ejercicio4ConClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("digite un numero:");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero>=0) {
            System.out.println("el numero :" + numero + "es positivo");
            conteo ++;
            System.out.println("digite otros numero:");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("ha ingresado " + conteo + "numeros que son negativos");
    }
}
/*en realidad el ejercicio esta mal,porque el mensaje final cuenta todos los numeros (negativos on no),hay que
/*corregirlo para que cuente solo los negativos
 */