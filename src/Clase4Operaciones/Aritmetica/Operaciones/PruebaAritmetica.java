package Clase4Operaciones.Aritmetica.Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 3;
        aritmetica.b = 7;
        aritmetica.SumarNumeros();
        int resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado: " +resultado);
        resultado = aritmetica.sumarConArgumentos(12,26);
        System.out.println("resultado usando argumentos =" +resultado);
    }
}
