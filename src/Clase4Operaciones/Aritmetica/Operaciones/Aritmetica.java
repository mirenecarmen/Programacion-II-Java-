package Clase4Operaciones.Aritmetica.Operaciones;

public class Aritmetica {
    int a;
    int b;

    public void SumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado : " +resultado);
    }
    public int sumarConRetorno(){
        return a + b;
    }
    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }

}
