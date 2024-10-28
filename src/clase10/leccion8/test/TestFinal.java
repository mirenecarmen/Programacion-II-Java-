package clase10.leccion8.test;

import clase10.leccion8.domain.Persona;

/* Uos de la palabra Final
Esta palabra tiene diferentes significados dependiendo de donde se aplique:
Variables:evita cambiar el valor que almacena la variable
metodos:evita que se modifique la definicion o el comportamiento
de un metodo desde una subclase (hija)
Clases:evita que se creen clases hijas
Otra caracteristica es que normalmente,cuando trabajamos con variables
se combina con el modificador de acceso estatico para converir una
variable en una constante,es decir que no se puede modificar su valor,
el ejemplo de eso es la clase Math en la cual todos sus atributos son de
tipo static y final,es por esto que la variable pi* se conoce como
constante


 */
public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 3743455;
        System.out.println(" miDni =" + miDni);
        //miDni = 20432344;
        //no se puede reasignar una variable,entonces da error
        // Persona.CONSTANTE_AQUI = 9; da error
        //NO se puede modificar
        final Persona persona1 = new Persona();//persona1 ahora es una variable,no un objeto
        //persona1 = new Persona();no se puede asignar una nueva referencia
        persona1.setNombre("ariel bet");
        System.out.println("persona1 nombre =" +persona1.getNombre());
        //no se pueden modificar las referencia pero si el contenido del objeto
        persona1.setNombre("liliana");
        System.out.println("persona1 nombre =" +persona1.getNombre());
        //si se puede realizar la modificacion del atributo
    }


}
