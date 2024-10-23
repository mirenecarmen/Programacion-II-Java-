package clase8EjercicioConContextoEstatico.test;

import clase4.PruebaPersona;
import clase8EjercicioConContextoEstatico.domain.Persona;

public class PruebaPersona2 {
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel");
        System.out.println("persona1 =" + persona1);
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        imprimir (persona1);
        imprimir (persona2);
        // this.contador=10; no se puede referenciar desde un contexto estatico
        PruebaPersona2 persona21=new PruebaPersona2();
        System.out.println(persona21.getContador());
    }

    public static void imprimir (Persona persona) {
        System.out.println("persona = " + persona);

    }
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}
