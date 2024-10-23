package clase7;
/* vamos a crear una clase dentro de otra clase,hasta ahora vimos metodos dentro de otros metodos
* en una plantilla tenemos una clase llamada Aritmetica2,ahora,si queremos crear una clase afuera de la clase
* que ya tenemos ,debemos saber que SOLO una clase puede ser publica,las demas NO,entonces la otra clase
* que creemos fuera dee esta clase ya no puede ser con modificador de acceso publico,sino que tiene que ser defaul o package */

public class Aritmetica2 {
    // Atributos de la clase
    int a;
    int b;

    // Constructor vacío
    public Aritmetica2() {
        System.out.println("Se está ejecutando el constructor 1: ");
    }

    // Sobrecarga de constructores (constructor con parámetros)
    public Aritmetica2(int a, int b) {
        this.a = a; //el compilador le indica cual es la variable y cuan es el atributo (la diferencia)
        this.b = b;
        System.out.println("Se está ejecutando el constructor 2");
    }

    // Método para sumar los números (sin retorno)
    public void SumarNumeros() {
        System.out.println("La suma es: " + (this.a + this.b));
    }

    // Método que retorna la suma de los atributos
    public int sumarConRetorno() {
        return this.a + this.b;
    }

    // Método con argumentos para la suma
    public int sumarConArgumentos(int a, int b) {
        return a + b;
    }
}
/*no ponemos default,al creal al clase fuera de la publica ya se interpreta que es de tipo defaul el mo
dificador
Aqui creamos una nueva CLase llamada PErsona */

class Persona {

    String nombre;
    String apellido;

    Persona (String nombre,String apellido){ //Constructor
        super(); //siempre va primero
        //Imprimir imprimir = new Imprimir();
        //super(); // este seria el metodo constructor de /para la clase padre object,siempre va antes de los atributos
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido; // de esta manera tenemos un constructor apuntando a nuestra nueva clase
        System.out.println("objeto persona usando this:" +this);
    }
}
 //ahora creamos otra clase llamada imprimir,creamos el metodo constructor
class Imprimir{
    public Imprimir(){
        super(); //el constructor de la clase padre,para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase Imprimir:" +persona);
        System.out.println("impresion del objeto actual (this)" +this);
    }

 }
