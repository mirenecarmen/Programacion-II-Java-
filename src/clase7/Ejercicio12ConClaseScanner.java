package clase7;

import java.util.Scanner;

/* ejercicio 12: pedir un numero y calcular su factorial */
public class Ejercicio12ConClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero: ");
        int numero = entrada.nextInt(); // Se captura la entrada del usuario
        long factorial =1;
        for (int i = 1; i <= numero; i++){
            factorial *= i;
        }
        System.out.println("el factorial del numero ingresado es :" +factorial);
    }
}
