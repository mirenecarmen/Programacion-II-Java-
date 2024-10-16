package Clase6.Ejercicio6ProyectoCaja;
/*Ejercicio 1:crear un proyecto segun especificaciones mostradas a continuacion:
La formula es : volumen = ancho *alto*profundidad
 */
public class PuebaCaja {
    public static void main(String[] args) { //metodo main
        int medidaAncho = 3; //valores ingresados en codigo duro
        int medidaAlto = 2;
        int medidaProf = 6;

        ProyectoCaja caja1 = new ProyectoCaja(); // instanciamos el objeto,constructor vacio
        caja1.ancho = medidaAncho; //le pasamos los valores al objeto
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        int resultado = caja1.calcularVolumen();//llamamos al metodo

        // primer resultado
        System.out.println("resultado volumen de caja 1:" + resultado);
        ProyectoCaja caja2 = new ProyectoCaja(2,4,6);// llamamos al constructor 2
        //con nuevos argumentos
        // llamamos con el nuevo objeto al mtodo para un nuevo calculo
        System.out.println("resultado volumen de caja 2:" + caja2.calcularVolumen());
    }
}
