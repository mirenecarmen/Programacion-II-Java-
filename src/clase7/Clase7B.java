package clase7;

public class Clase7B {
    /* No ponemos default, al crear la clase fuera de la pública ya se interpreta que es de tipo default
     * el modificador por defecto es el que no tiene ninguna palabra clave delante.
     */

    class Persona {
        String nombre;
        String apellidos;

        Persona(String nombre, String apellidos) {
            this.nombre = nombre;
            this.apellidos = apellidos; // de esta manera tenemos un constructor apuntando a nuestra nueva clase
        }
    }
}
