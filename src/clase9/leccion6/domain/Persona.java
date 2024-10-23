package clase9.leccion6.domain;
//HERENCIA PARTE I
/* usos de "protected" pensado para el concepto de herencia */
public class Persona {
    //atributos de herencia
    //trabajamos solo con "private" cuando vemos herencia
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    //constructor vacio (no se crea solo,tenemos que crearlo nosotros)
    //el constructor vacio es para crear objetos sin necesidad de inicializar
    //los atributos de la clase
    public Persona(){ //constructor 1

    }
    public Persona(String nombre){ //constructor 2
        this.nombre = nombre;
    //hacemos click derecho,insert code y tenemos para insertar geter seter Tostring etc
    }

    public Persona(String nombre, char genero, int edad, String direccion) { //constructor 3,es completo
        //y apunta a todos los atributos
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // ahora crearemos el metodo Tostring

    @Override //override :reescribir,porque el metodo tostring ya ha sido creado y todas las clases
    //heredan de la clase objet
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
//CUANDO creo los geter y seter ,instantaneamente el modificador de acceso pasa a ser protected (antes de esto)
//era private,
//en la clase 2 lo mdoifico nuevamete a private
