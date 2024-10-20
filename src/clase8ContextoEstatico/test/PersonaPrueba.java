package clase8ContextoEstatico.test;

import clase8ContextoEstatico.domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel");
        System.out.println("persona1 =" + persona1);
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
    }
}

/* el this se utitlizan para los atributos que no son estaticos y el nombre de la clase se usan para los
que si son estaticos,con el debug y f7 vamos a ver como funciona el paso a paso
 */
