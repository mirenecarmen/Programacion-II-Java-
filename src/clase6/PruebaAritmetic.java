package clase6;

import LeccionClasesYobjetos.Clases.Persona;

public class PruebaAritmetic {
    public static void main(String[] args) {
        var a= 10; // variables locales
        int b=15; // variables locales
        miMetodo();
        // Crear el objeto aritmetica1 con el constructor vacío
        Aritmetic aritmetica1 = new Aritmetic();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.SumarNumeros(); // Llamada al método sin retorno

        // Usar el método que devuelve la suma
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado = " + resultado);

        // Usar el método que suma con argumentos
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: " + resultado);
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        // Crear el objeto aritmetica2 con el constructor con parámetros
        Aritmetic aritmetica2 = new Aritmetic(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
        //aritmetica = null ; nunca usarlo,no se debe hacer
        //system.gc();metodo para limpiar residuos,es pesado ,no utilizar
        Persona persona = new Persona("ariel" , "betancud");
        System.out.println("persona =" +persona);
        System.out.println("Persona nombre" +persona.nombre); //da error al correr,corregir
        System.out.println("Persona apellido " +persona.apellido);

    }
    /*modularidad :creamos un nuevo metodo */
    public static void miMetodo(){
        // int a = 10;
        System.out.println("Aqui hay otro metodo"); /*este metodo,al crearse en el main,solo se podrá usar en
        esta clase*/
    }
    /* creamos una nueva clase */
}
