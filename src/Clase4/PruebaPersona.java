package Clase4;

public class PruebaPersona {
    public static void main(String[] args) {
        MetodoPersona persona1;
        persona1 = new MetodoPersona(); //llamamos al constructor

        // tambien puedo escribirlo como
        //MetodoPersona persona1 = new MetodoPersona(); solo llamamos al new al momento de crear otra persona
        //
        persona1.nombre = "Ariel"; // el valor hexadecimal generalmente comineza con 0x,de esta manera la
        // variable puede acceder al objeto
        persona1.apellido = "Betancud";
        persona1.obtenerInformacion();
        //ahora creamos un nuevo objeto
        MetodoPersona persona2 = new MetodoPersona();
        persona2.nombre = "Osvaldo";
        persona2.apellido= "Giordanini";
        persona2.obtenerInformacion();
    }
}
