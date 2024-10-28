package clase11Matrices.leccion10.test;

import clase11Arrays.leccion9.domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Arieel");
        personas[1] = new Persona("Osvaldo");
        System.out.println("persona 0 =" + personas[0]);
        System.out.println("persona 1 =" + personas[1]);

        /*Clase 6: ahora veremos como iterar un array de tipo object*/
        for (int i = 0; i < personas.length;i++){
            System.out.println("persona = " +i+"=" + personas[i]);
        }

        //sintaxis resumida para trabajar con arrays
        String frutas[] = { "banana", "peras","limones"};

        for (int i = 0; i < frutas.length;i++){
            System.out.println(" frutas " +i+ "=" +frutas[i]);

        }
    }
}
