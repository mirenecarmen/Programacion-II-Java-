package clase6;

public class Aritmetic {
    // Atributos de la clase
    int a;
    int b;

    // Constructor vacío
    public Aritmetic() {
        System.out.println("Se está ejecutando el constructor 1: ");
    }

    // Sobrecarga de constructores (constructor con parámetros)
    public Aritmetic(int a, int b) {
        this.a = a;
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
