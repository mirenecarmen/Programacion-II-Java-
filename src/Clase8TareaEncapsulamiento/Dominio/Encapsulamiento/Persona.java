package Clase8TareaEncapsulamiento.Dominio.Encapsulamiento;

public class Persona {
    //primero creamos los atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //segundo,creamos los CONSTRUCTORES ,que deben ser publicos y definimos los atributos
    //deben coincidir con el tipo de variable del atributo ,para que se conecten
    public Persona (String nombre,double sueldo,boolean eliminado){
        this.nombre = nombre;
        //aqui usamos el guion bajo para diferenciar la variable del atribto
        this.sueldo = sueldo;
        this.eliminado = eliminado;

    }
    //ahora pasamos a definir o crear los metodos que necesitams getter y setter
    //hacemos click secundario y seleccionamos GENERATE

    public String getNombre() { //get necesita retornar el valor
        return nombre;
    }

    public void setNombre(String nombre) { //set es el que modifica
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { //para el tipo BOOLEAN EN EL GET se usa el metodo IS
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    /*  TODO ESTO es para apuntar hacia el objeto que queremos instanciar */
    public String ToString(){ //convierrte en una cadena cada atributos
        return "clase9.leccion6.domain.Persona [nombre :" +this.nombre + ",sueldo: " +this.sueldo + "eliminado "+this.eliminado+"]";
    }
}
