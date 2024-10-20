package clase6.Ejercicio6ProyectoCaja;
/*Ejercicio 1:crear un proyecto segun especificaciones mostradas a continuacion:
La formula es : volumen = ancho *alto*profundidad
 */
public class ProyectoCaja { //clase publica caja
    // atributos (caracteristicas)
    int ancho;
    int alto;
    int profundo;
    // metodos y constructores (acciones)

    public ProyectoCaja(){
    }
    // constructor con parametros
    public ProyectoCaja(int ancho,int alto,int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen(){
        //metodos para calcular
        return ancho*alto*profundo;
    }
}
