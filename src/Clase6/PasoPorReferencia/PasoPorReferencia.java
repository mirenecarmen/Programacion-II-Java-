package Clase6.PasoPorReferencia;

import Clase4.MetodoPersona; // el punto indica que se llamó a la clase persona del paquete Clase4

public class PasoPorReferencia {
    public static void main(String[] args) {
        MetodoPersona persona1 = new MetodoPersona();//con new accederemos a todos los atributos ue son publicos
        persona1.nombre = "Ester";
        System.out.println("persona 1 nombre =" +persona1.nombre);
        cambiarValor(persona1);
        System.out.println("el cambio que hicimos en el nombre es :" + persona1);
        persona1 = cambiarElvalor(persona1);
        MetodoPersona persona2 = new MetodoPersona();
        // MetodoPersona persona2 = null;
        persona2 = cambiarElvalor(persona2);
        System.out.println("el nuevo valor del objeto es :" +persona2.nombre);
    }
    /*ahora vamos a crear otro metodo,que será de tipo publico tambien
    el paso por referencia es simplemente que nosotros estamos utilizando la clase persona,y para
    acceder al objecto y a la clase,el paso por referencia en este caso va a ser a traves de la clase clase9.leccion6.domain.Persona
    y vamos a pasarle persona */
    public static void cambiarValor(MetodoPersona persona) { //parametro por referencia
        persona.nombre = "Maria";
        return;
    }
    public static MetodoPersona cambiarElvalor (MetodoPersona persona){
        if (persona == null){
            System.out.println("valor de la persona es invalido:Null.");
            return null;
        }
        else {
            persona.nombre = "Monica";
            return persona;
        }
        /*el return va al final porque si se lo pone aqui anula todo lo de abajo,o sea,nunca poner al comien
        zo de un metodo */

    }

}
