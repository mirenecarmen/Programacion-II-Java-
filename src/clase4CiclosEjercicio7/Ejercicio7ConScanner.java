package clase4CiclosEjercicio7;

import java.util.Scanner;

public class Ejercicio7ConScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,conteo = 0 ,suma = 0;
        float promedio = 0;
        System.out.println("digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            suma += numero;
            conteo++;
            System.out.println("digite otro numero :");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (conteo==0){
            System.out.println("error,la division entre 0 no existe.");
        }
        else {
            promedio =(float) suma /conteo;
            System.out.println("el promero es :" +promedio);
        }
    }
}
