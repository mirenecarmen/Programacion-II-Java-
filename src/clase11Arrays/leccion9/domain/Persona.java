package clase11Arrays.leccion9.domain;
/* ahora veremos lo que son los arreglos de tipo OBJECT,vamos a trabajar con referencia a objetos */

public class Persona {
    private String nombre;

    public Persona (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre =" + nombre + "}" + "," +super.toString();
    }
}
