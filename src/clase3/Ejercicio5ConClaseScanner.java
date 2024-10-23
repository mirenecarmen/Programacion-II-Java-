package clase3;
/* realizar un juego para adivinar un numero.Para ello,generar un numero aleatorio entre 0 1 100 y luego
* ir pidiendo numero indicando si "es mayor" o "es menor" segun sea mayor o menor con respecto a N.
* El proceso termina cuanto el usuario acierta y mostramos el numero de intentos hechos */

import java.util.Scanner;

public class Ejercicio5ConClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random()*100);//esto genera un numero aleatorio
        do{
            System.out.println("digite un numero:");
            numero = Integer.parseInt(entrada.nextLine());
            if (numero < aleatorio) {
                System.out.println("digite un numero mayor.");
            }
            else if (numero > aleatorio){
                System.out.println("digite un numero menor.");
            }
            else {
                System.out.println("felicidades,has adivinado el numero");
            }
            conteo ++;
        }while (numero != aleatorio);
        System.out.println("adivinaste el numero en :" + conteo + " intentos.");
    }
}
