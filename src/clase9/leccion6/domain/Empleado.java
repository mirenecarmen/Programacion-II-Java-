package clase9.leccion6.domain;

public class Empleado extends Persona {
    //vamos a hacer que la clase EMPLEADO sea HRENCIA de la clase PERSONA
    /*para ello usamos la palabra extends seguida de la clase padre.
    Otra cosa tambien es que en java solo hay herencia simple (no herencia multiple)
     */
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //es para incrementar

    //Constructor


    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    //quito setidEmpleado porque no necesito que sea modificado
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
//concatenacion de cadenas
    //con cada simbolo de cadena en java se crea un objeto de tipo string
    //los objetos en java son inmutables
    //con el metod append si se pueden modificar
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(); //clase Stringbuilder
        sb.append("idEmpleado{idEmpleado=").append(idEmpleado);//primero pone la cadena y luego pone el atributo
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
