package Clase8TareaEncapsulamiento.Dominio.Test;

import Clase8TareaEncapsulamiento.Dominio.Encapsulamiento.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo",57000,false);
        // modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre ="Juan ignacio"; ya no se puede utilizar
        //System.out.println("el nombre es :"+persona1.nombre); Error
        System.out.println("personal con su nombre modificado :" +persona1.getNombre());
        System.out.println("personal con su sueldo modificado :" +persona1.getSueldo());
        System.out.println("personal para obtener el booleano :" +persona1.isEliminado());

        System.out.println("persona1:" +persona1.ToString());

        /* tarea: crear otro objeto de tipo clase9.leccion6.domain.Persona,asignar valores de manera inicial
        y  imprimir ,luego modificar sus valores y volver a imprimir
         */
        // asignar valores de manera inicial
        Persona persona2 = new Persona("María", 45000, true);

        // Imprimir los valores iniciales de persona2
        System.out.println("Valores iniciales de persona2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("Estado de eliminado: " + persona2.isEliminado());

        // Modificar los valores de persona2
        persona2.setNombre("Ana");
        persona2.setSueldo(50000);
        persona2.setEliminado(false);

        // Volver a imprimir los valores modificados de persona2
        System.out.println("Valores de persona2 después de la modificación:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("Estado de eliminado: " + persona2.isEliminado());
    }
}




