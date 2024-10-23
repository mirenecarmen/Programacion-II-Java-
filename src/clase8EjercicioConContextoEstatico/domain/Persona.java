package clase8EjercicioConContextoEstatico.domain;

public class Persona {
    //cargamos los atributos
    private int idPersona;
    private static int contadorPersona;
    /*el atributo esta asociado solo a la clase Persona,pero no al objeto
    porque esta private y static*/
    private String nombre;



    //constructor
    public Persona(String nombre){
        this.nombre = nombre;

        // incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++;/*no usar el operador This
        vamos a asignar un nuevo valor a la variable idPersona */
        this.idPersona = Persona.contadorPersona;
    }
    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }


    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre; //nosotros ponemos el this en los getter
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override /*la anotacion significa que estamos sobreescribiendo el metodo,significa que en la herencia
     desde la clase object se hereda este metodo tostring*/
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre =" + nombre +
                '}';
    }
}
