package clase1;

public class CicloWhile {
    public static void main(String[] args) {
        var conteo = 0 ; //inferencia de tipos
        while (conteo < 7) {
            System.out.println("conteo = " + conteo );
            conteo++; //vamos aumentando en 1 unidad la variable
        }
    }

}
