package clase11Arrays.arreglos_ejercicio_2;

/* Ejercicio 2: Leer 5 numeros,guardarlos en un arreglo y mostrarlos en el arreglo
el orden inverso al introducirlos
 */

import java.util.Scanner;

public class Arreglos_ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println(" guardando los elementos del arreglo");
        for ( int i= 0; i< 5; i++){
            System.out.println((i+1)+" digite un numero:");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("imprimimos los elementos del arreglo:");
        for ( int i= 4; i >= 0; i--){ //aqui el iterador empieza al reves d
            System.out.println(i+" ");
        }
        System.out.println(" ");
    }
}
