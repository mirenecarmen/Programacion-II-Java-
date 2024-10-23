package clase5;

import java.util.Scanner;

public class Ejercicio8ConClaseScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero:");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }
    }
}
